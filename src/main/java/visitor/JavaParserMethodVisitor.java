package visitor;

import com.github.javaparser.ast.*;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.visitor.GenericVisitorAdapter;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.printer.PrettyPrinterConfiguration;
import com.google.common.collect.ArrayListMultimap;

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
}
