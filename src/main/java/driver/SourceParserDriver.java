package driver;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.ast.CompilationUnit;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import config.SourceParserArgConfiguration;
import parser.MethodTransformer;

import java.io.File;
import com.github.javaparser.ast.type.Type;
import java.util.*;

import org.apache.commons.cli.*;
import util.SourceParserFileUtils;

public class SourceParserDriver {
    public static void main(String[] args) throws ParseException {
        CommandLineParser cParser = new DefaultParser();
        Options options = SourceParserArgConfiguration.getOptions();
        CommandLine cLine = cParser.parse(options, args);

        String sourcecodePath = cLine.getOptionValue(SourceParserArgConfiguration.SOURCE_CODE_PATH_ARG);
        String outputcodePath = "output_codebase";
        if (cLine.hasOption(SourceParserArgConfiguration.OUTPUT_CODE_PATH_ARG)) {
            outputcodePath = cLine.getOptionValue(SourceParserArgConfiguration.OUTPUT_CODE_PATH_ARG);
        }


        File sourcecodeDir = new File(sourcecodePath);
        Map<String, CompilationUnit> currentTransformationStates = new HashMap<>();
        Multimap<String, List<List<Type>>> parameters = ArrayListMultimap.create();

        System.out.println("Transforming All Methods to Static\n");
        new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
            try {
                MethodTransformer.AddStaticMethodModifier(file, currentTransformationStates);
                MethodTransformer.ReportMethodParameterTypes(file, currentTransformationStates, parameters);
            } catch (ParseProblemException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }).explore(sourcecodeDir);

        SourceParserFileUtils.writeAll(currentTransformationStates, outputcodePath);

        System.out.println("Transformation done\n");
        System.out.println("Reporting Method Parameters:");
        parameters.keySet().forEach(methodPath -> {
            System.out.print(methodPath + " ");
            System.out.println(parameters.get(methodPath));
        });
    }
}
