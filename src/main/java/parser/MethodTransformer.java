package parser;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import visitor.JavaParserMethodVisitor;

import java.io.File;
import com.github.javaparser.ast.type.Type;
import java.util.List;
import java.util.Map;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.StaticJavaParser;


public class MethodTransformer {
    /*
        Modify all method declarations -- adds static to method declaration
     */
    public static void AddStaticMethodModifier (File file, Map<String, CompilationUnit> currentStates) {
        try {
            CompilationUnit cu = currentStates.getOrDefault(file.toString(), StaticJavaParser.parse(file));
            new JavaParserMethodVisitor.AddStaticMethodModifierVisitor().visit(cu, null);
            currentStates.put(file.toString(), cu);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void ReportMethodParameterTypes (File file, Map<String, CompilationUnit> currentStates, Multimap<String, List<List<Type>>> parameters) {
        try {
            ArrayListMultimap<String, List<Type>> parametersByMethod = ArrayListMultimap.create();
            CompilationUnit cu = currentStates.getOrDefault(file.toString(), StaticJavaParser.parse(file));
            new JavaParserMethodVisitor.ReportMethodParameterTypesVisitor().visit(cu, parametersByMethod);
            parametersByMethod.keySet().forEach(method -> {
                parameters.put(file.toString().replaceAll(".java", "") + ":" + method, parametersByMethod.get(method));
            });
            currentStates.put(file.toString(), cu);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
