package visitor;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.GenericVisitorAdapter;
import com.github.javaparser.printer.PrettyPrinterConfiguration;
import com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration;
import com.github.javaparser.symbolsolver.javaparsermodel.declarations.JavaParserMethodDeclaration;
import util.LocalVariable;
import util.MonitorInfo;

import java.util.*;

public class JavaParserMethodVisitor {
    /**
     * Simple visitor implementation for visiting MethodDeclaration nodes.
     */
    protected static final PrettyPrinterConfiguration prettyPrinterNoCommentsConfiguration = new PrettyPrinterConfiguration().setPrintComments(false);

    public static class AddStaticMethodModifierVisitor extends GenericVisitorAdapter<Node, Void> {
        @Override
        public Node visit(MethodDeclaration n, Void arg) {
            /*
             * here you can access the attributes of the method. this method will be called for all methods in this CompilationUnit,
             * including inner class methods
             */
            NodeList<Modifier> modifiers = n.getModifiers();
            if (!modifiers.contains(new Modifier(Modifier.Keyword.STATIC))) {
                modifiers.add(new Modifier(Modifier.Keyword.STATIC));
            }
            n.setModifiers(modifiers);
            return super.visit(n, arg);
        }
    }

    public static class AddNewInputVisitor extends  GenericVisitorAdapter<Node, Map<String, Object>> {
        @Override
        public Node visit(MethodDeclaration n, Map<String, Object> infoMap) {
            super.visit(n, infoMap);
            BlockStmt body = n.getBody().get();
            String[] testCaseName = infoMap.get("TEST_CASE").toString().split("\\.");
            // Check if is target test case (important for monitoring only the IOs for current IORecord
            if (!n.getNameAsString().equals(testCaseName[testCaseName.length - 2])) {
                return n;
            }
            List<Statement> statements = body.getStatements();
            ListIterator<Statement> listIterator = statements.listIterator();
            List<Statement> newStatements = addNewInputStatements(infoMap.get("IORECORD_PATH"), infoMap.get("NEW_INPUTS"));
            for (Statement s : newStatements) {
                listIterator.add(s);
            }
            return n;
        }
    }

    private static List<Statement> addNewInputStatements(Object iORecordPath, Object newInputs) {
        String path = (String) iORecordPath;
        List inputs = (ArrayList) newInputs;
        List<Statement> s = new ArrayList<>();
        //s.add(StaticJavaParser.parseStatement("//New Initialization"));
        s.add(StaticJavaParser.parseStatement(String.format("XMLParser xmlParser = new XMLParser(\"%s\");", path)));
        for (int i = 0; i < inputs.size(); i++) {
            String clazz = inputs.get(i).getClass().getCanonicalName();
            String object_name = String.format("newInput%d", i);
            String init = String.format("%s %s = (%s) xmlParser.getNewInputByIndex(%d);", clazz, object_name, clazz, i);
            s.add(StaticJavaParser.parseStatement(init));
        }
        return s;
    }

    private static int monitor_counter = 0;

    public static class AddMonitoringCodeVisitor extends GenericVisitorAdapter<Node, MonitorInfo> {
        @Override
        public Node visit(MethodDeclaration n, MonitorInfo info) {
            super.visit(n, info);
            BlockStmt body = n.getBody().get();
            String[] testCaseName = info.getTestCase().split("\\.");
            // Check if is target test case (important for monitoring only the IOs for current IORecord
            if (!n.getNameAsString().equals(testCaseName[testCaseName.length - 2])) {
                return n;
            }
            List<Statement> statements = body.getStatements();
            ListIterator<Statement> listIterator = statements.listIterator();
            while (listIterator.hasNext()) {
                Statement std = listIterator.next();
                if (isLocalVariable(std)) {
                    NodeList<VariableDeclarator> varExpr = std.asExpressionStmt().getExpression().asVariableDeclarationExpr().getVariables();
                    for (VariableDeclarator var : varExpr) {
                        LocalVariable localVar = new LocalVariable(var.getNameAsString(), var.getType());
                        Set<LocalVariable> locals = info.getLocalVariables();
                        locals.add(localVar);
                        info.setLocalVariables(locals);
                    }
                }
                if (parseStatement(std, info.getTargetMethod())) {
                    List<Statement> newStatements = addStatements(std, n.getNameAsString(), info.getLocalVariables());
                    listIterator.previous();
                    for (Statement s: newStatements) {
                        listIterator.add(s);
                    }
                    listIterator.next();
                }
            }
            return n;
        }

        private List<Statement> addStatements(Statement std, String outerMethodName, Set<LocalVariable> localVariables) {
            List<Statement> s = new ArrayList<>();
            ResolvedMethodDeclaration signature = std.asExpressionStmt().getExpression().asMethodCallExpr().resolve();
            NodeList<Parameter> parameters = ((JavaParserMethodDeclaration) signature).getWrappedNode().getParameters();
            ResolvedMethodDeclaration methodDec = std.asExpressionStmt().getExpression().asMethodCallExpr().resolve();
            String methodName = methodDec.getPackageName() + "." + methodDec.getClassName() + "." + methodDec.getName();
            s.add(StaticJavaParser.parseStatement(String.format("Reporter reporter = new Reporter(\"%s\");", methodDec.getPackageName() + "." + methodDec.getClassName() + "." + outerMethodName + "." + methodDec.getName())));
            int index = 0;
            for (Parameter param : parameters) {
                String paramName = ((ExpressionStmt) std).getExpression().getChildNodes().get(index + 1).toString();
                String monitorName=  "g" + monitor_counter++;
                String g1 = String.format("GenericsType<%s> %s = new GenericsType<>();", param.getTypeAsString(), monitorName);
                s.add(StaticJavaParser.parseStatement(g1));

                String g2 = String.format("%s.set(%s,\"%s\",\"%s\", %d);", monitorName, paramName, paramName, methodName, index++);
                s.add(StaticJavaParser.parseStatement(g2));

                String g3 = String.format("reporter.addTargetParam(%s);", monitorName);
                s.add(StaticJavaParser.parseStatement(g3));
            }
            index = 0;
            for (LocalVariable localVar : localVariables) {
                String variableName = localVar.getName();
                String monitorName = "g" + monitor_counter++;
                String g1 = String.format("GenericsType<%s> %s = new GenericsType<>();", localVar.getTypeAsString(), monitorName);
                s.add(StaticJavaParser.parseStatement(g1));

                String g2 = String.format("%s.set(%s,\"%s\",\"%s\", %d);", monitorName, variableName, variableName, methodName, index++);
                s.add(StaticJavaParser.parseStatement(g2));

                String g3 = String.format("reporter.addLocalVar(%s);", monitorName);
                s.add(StaticJavaParser.parseStatement(g3));
            }
            s.add(StaticJavaParser.parseStatement("reporter.report();"));
            return s;
        }

        private boolean isLocalVariable(Statement std) {
            if (std.isExpressionStmt()) {
                Expression expStmt = std.asExpressionStmt().getExpression();
                return expStmt.isVariableDeclarationExpr();
            }
            return false;
        }
    }

    public static class VariableReplacementVisitor extends GenericVisitorAdapter<Node, Map> {
        @Override
        public Node visit(MethodDeclaration n, Map infoMap) {
            super.visit(n, infoMap);
            BlockStmt body = n.getBody().get();
            String[] testCaseName = infoMap.get("TEST_CASE").toString().split("\\.");
            // Check if is target test case (important for monitoring only the IOs for current IORecord
            if (!n.getNameAsString().equals(testCaseName[testCaseName.length - 2])) {
                return n;
            }
            List<Statement> statements = body.getStatements();
            ListIterator<Statement> listIterator = statements.listIterator();
            String TARGET = (String) infoMap.get("TARGET_METHOD");
            Map<String, String> replacementMap = (Map<String, String>) infoMap.get("REPLACEMENT_MAP");
            while (listIterator.hasNext()) {
                Statement std = listIterator.next();
                if (parseStatement(std, TARGET)) {
                    MethodCallExpr expStmt = std.asExpressionStmt().getExpression().asMethodCallExpr();
                    for (Expression argExpr : expStmt.getArguments()) {
                        if (argExpr.isNameExpr()) {
                            NameExpr nameExpr = argExpr.asNameExpr();
                            nameExpr.setName(new SimpleName(replacementMap.get(nameExpr.getNameAsString())));
                        }
                    }
                }
            }
            return n;
        }
    }

    public static class ReportMethodSignatureVisitor extends GenericVisitorAdapter<Node, Map<String, List<String>>> {
        @Override
        public Node visit(MethodDeclaration n, Map<String, List<String>> inputMap) {
            /*
             * here you can access the attributes of the method. this method will be called for all methods in this CompilationUnit,
             * including inner class methods
             */
            List<String> signatures = inputMap.containsKey(n.getNameAsString()) ? inputMap.get(n.getNameAsString()) : new ArrayList<String>();
            StringBuilder sb = new StringBuilder();
            sb.append(n.getNameAsString());
            sb.append("(");
            boolean firstParam = true;
            for (Parameter param : n.getParameters()) {
                if (firstParam) {
                    firstParam = false;
                } else {
                    sb.append(", ");
                }
                sb.append(param.getType().toString());
                if (param.isVarArgs()) {
                    sb.append("...");
                }
            }
            sb.append(")");
            signatures.add(sb.toString());
            StringBuilder classPathBuilder = new StringBuilder();
            Optional<Node> optClassNode = n.getParentNode();
            if (optClassNode.get() != null){
                ClassOrInterfaceDeclaration classNode = (ClassOrInterfaceDeclaration) optClassNode.get();
                classPathBuilder.append(classNode.getNameAsString() + ":");
            }
            classPathBuilder.append(n.getNameAsString());
            inputMap.put(classPathBuilder.toString(), signatures);
            return super.visit(n, inputMap);
        }
    }

    public static boolean parseStatement(Statement std, String TARGET) {
        if (std.isExpressionStmt()) {
            Expression expStmt = std.asExpressionStmt().getExpression();
            if (expStmt.isMethodCallExpr()) {
                String signature = expStmt.asMethodCallExpr().resolve().getQualifiedSignature();
                return signature.equals(TARGET);
            }
        }
        return false;
    }
}
