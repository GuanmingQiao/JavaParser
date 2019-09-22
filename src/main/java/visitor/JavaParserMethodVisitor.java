package visitor;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.GenericVisitorAdapter;
import com.github.javaparser.ast.type.Type;
import com.google.common.collect.ArrayListMultimap;

import java.util.ArrayList;
import java.util.List;

public class JavaParserMethodVisitor {
    /**
     * Simple visitor implementation for visiting MethodDeclaration nodes.
     */
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

    public static class ReportMethodParameterTypesVisitor extends GenericVisitorAdapter<Node, ArrayListMultimap<String, List<Type>>> {
        @Override
        public Node visit(MethodDeclaration n, ArrayListMultimap<String, List<Type>> inputMap) {
            /*
             * here you can access the attributes of the method. this method will be called for all methods in this CompilationUnit,
             * including inner class methods
             */
            List<Type> types = new ArrayList<>();
            n.getParameters().forEach(node -> {
                types.add(node.getType());
            });
            inputMap.put(n.getName().toString(), types);
            return super.visit(n, inputMap);
        }
    }
}
