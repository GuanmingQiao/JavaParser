package parser;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import visitor.JavaParserMethodVisitor;

import java.io.File;
import java.util.HashMap;
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

    public static void ReportMethodSignatures(File file, Map<String, CompilationUnit> currentStates, Map<String,  List<String>> parameters) {
        try {
            CompilationUnit cu = currentStates.getOrDefault(file.toString(), StaticJavaParser.parse(file));
            new JavaParserMethodVisitor.ReportMethodSignatureVisitor().visit(cu, parameters);
            currentStates.put(file.toString(), cu);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
