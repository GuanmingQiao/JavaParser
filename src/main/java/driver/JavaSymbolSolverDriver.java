package driver;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.model.resolution.TypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import util.SourceParserFileUtils;
import util.MonitorInfo;
import util.XMLParser;
import visitor.JavaParserMethodVisitor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class JavaSymbolSolverDriver {
    private static  final String ROOT_PATH = "/Users/guanmingqiao/Documents/GitHub/source-parser/source_codebase/";

    private static final String RUNTIME_PATH = "./source_codebase/runtime_result_repo/";

    private static final String IO_RECORD_PATH = "./source_codebase/io_record_repo";

    private static final String JSON_IO_PATH = "./source_codebase/io_replacement_repo/";

    private static final String SOURCE_PATH = ROOT_PATH + "replacement_repo/";

    private static final String TEMP_PATH = ROOT_PATH + "temp_repo/";

    private static final String TEMP_PACKAGE_PATH  = TEMP_PATH + "replacement_repo/";

    private static final String FILE_PATH = SOURCE_PATH + "MultTester.java";

    private static  final String TARGET_CLASS = "replacement_repo.MultTester";

    private static final String TARGET = "replacement_repo.OriginalClass.originalMethod(java.util.List<java.lang.Integer>)";

    private static final String FILE_NAME = "MultTester.java";

    public static void main(String[] args) throws Exception {
        TypeSolver typeSolver = new ReflectionTypeSolver();
        TypeSolver contextTypeSolver = new JavaParserTypeSolver(new File(ROOT_PATH));
        typeSolver.setParent(contextTypeSolver);

        CombinedTypeSolver combinedSolver = new CombinedTypeSolver();
        combinedSolver.add(typeSolver);
        combinedSolver.add(contextTypeSolver);

        JavaSymbolSolver symbolSolver = new JavaSymbolSolver(combinedSolver);
        StaticJavaParser.getConfiguration().setSymbolResolver(symbolSolver);

        // Generate io_replacement_repo from io_record_repo
        File[] testCases = new File(IO_RECORD_PATH).listFiles();
        for (File testCase : testCases) {
            File[] ioRecords = testCase.listFiles();
            for (File ioRecordPair : ioRecords) {
                // Create runtime_result_repo
                ProcessBuilder createRepoPB = new ProcessBuilder(Arrays.asList(String.format("mkdir %s", RUNTIME_PATH).split(" ")));
                createRepoPB.inheritIO();
                Process createRepoProcess = createRepoPB.start();
                createRepoProcess.waitFor();

                // Create IO Replacement Repo
                createRepoPB = new ProcessBuilder(Arrays.asList(String.format("mkdir %s", JSON_IO_PATH).split(" ")));
                createRepoPB.inheritIO();
                createRepoProcess = createRepoPB.start();
                createRepoProcess.waitFor();

                XMLParser xmlParser = new XMLParser(ioRecordPair.getPath());

                List<Object> oldInputs = xmlParser.getOldInput().sortedInputs;
                List<Object> newInputs = xmlParser.getNewInput().sortedInputs;

                CompilationUnit cu = StaticJavaParser.parse(new File(FILE_PATH));

                // Add Premain generate input from iORecord
                Map<String, Object> infoMap = new HashMap<>();
                infoMap.put("IORECORD_PATH", ioRecordPair.getAbsolutePath());
                infoMap.put("NEW_INPUTS", newInputs);
                infoMap.put("TEST_CASE", testCase.getName());
                cu.getTypes().forEach(classDec -> classDec.getMembers().forEach(method -> method.accept(new JavaParserMethodVisitor.AddNewInputVisitor(), infoMap)));

                CompilationUnit cuClone = cu.clone();

                // Add Premain Monitoring Code
                cu.getTypes().forEach(classDec -> classDec.getMembers().forEach(method -> method.accept(new JavaParserMethodVisitor.AddMonitoringCodeVisitor(), new MonitorInfo(TARGET, testCase.getName(), new HashSet<>()))));

                SourceParserFileUtils.write_normal(TEMP_PACKAGE_PATH, FILE_NAME, cu.toString());

                String cpCommand = "cp ";
                for (File name : Objects.requireNonNull(new File(SOURCE_PATH).listFiles())) {
                    cpCommand = cpCommand + SOURCE_PATH + name.getName() + " ";
                }
                cpCommand += "source_codebase/temp_repo/replacement_repo/";


                // Move Reporter to Temporary Repo
                ProcessBuilder moveFilePB = new ProcessBuilder(Arrays.asList(cpCommand.split(" ")));
                moveFilePB.inheritIO();
                Process moveFileProcess = moveFilePB.start();
                moveFileProcess.waitFor();

                // Compile all files
                String javacCommand = "javac -cp json-simple-1.1.1.jar:xstream-1.4.11.jar:xstream-1.4.11.1.jar:xpp3_min-1.1.4c.jar:. ";
                for (File name : Objects.requireNonNull(new File(TEMP_PACKAGE_PATH).listFiles())) {
                    javacCommand = javacCommand + TEMP_PACKAGE_PATH + name.getName() + " ";
                }

                ProcessBuilder javacPB = new ProcessBuilder(Arrays.asList(javacCommand.split(" ")));
                javacPB.inheritIO();
                Process javacProcess = javacPB.start();
                javacProcess.waitFor();

                // Run the test code
                ProcessBuilder javaPB = new ProcessBuilder(Arrays.asList(String.format("java -cp json-simple-1.1.1.jar:xstream-1.4.11.jar:xstream-1.4.11.1.jar:xpp3_min-1.1.4c.jar:xmlpull-1.1.3.1.jar:%s %s", TEMP_PATH, TARGET_CLASS).split(" ")));
                javaPB.inheritIO();
                Process javaProcess = javaPB.start();
                javaProcess.waitFor();

                // Delete temp codebase
                ProcessBuilder deletePB = new ProcessBuilder(Arrays.asList(String.format("rm -rf %s", TEMP_PATH).split(" ")));
                deletePB.inheritIO();
                Process deleteProcess = deletePB.start();
                deleteProcess.waitFor();

                findAndReplace(cuClone, oldInputs, newInputs, testCase.getName(), ioRecordPair.getName());

                // Delete runtime result repo
                deletePB = new ProcessBuilder(Arrays.asList(String.format("rm -rf %s", RUNTIME_PATH).split(" ")));
                deletePB.inheritIO();
                deleteProcess = deletePB.start();
                deleteProcess.waitFor();

                // Delete io_replacement_repo
                deletePB = new ProcessBuilder(Arrays.asList(String.format("rm -rf %s", JSON_IO_PATH).split(" ")));
                deletePB.inheritIO();
                deleteProcess = deletePB.start();
                deleteProcess.waitFor();
            }
        }
    }

    private static void findAndReplace(CompilationUnit cuClone, List<Object> oldInputs, List<Object> newInputs, String testCaseName, String ioRecordPairName) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        for (File f : Objects.requireNonNull(new File(RUNTIME_PATH).listFiles())) {
            try {
                Map<Object, List<String>> localVariableMap = new HashMap<>();
                Map<Object, List<String>> targetParamsMap = new HashMap<>();
                // Runtime old inputs
                JSONObject targetIO = (JSONObject) parser.parse(new FileReader(f));

                // Load runtime value of all local variables
                JSONArray localVariables = (JSONArray) targetIO.get("localVar");
                for (Object lv : localVariables) {
                    JSONObject localVariable = (JSONObject) parser.parse(lv.toString());
                    List<String> valuedNames = localVariableMap.getOrDefault(localVariable.get("value"), new ArrayList<>());
                    valuedNames.add(localVariable.get("variableName").toString());
                    localVariableMap.put(localVariable.get("value"), valuedNames);
                }

                // Load runtime value of target variables
                JSONArray targetParams = (JSONArray) targetIO.get("targetParam");
                for (Object lv : targetParams) {
                    JSONObject targetParam = (JSONObject) parser.parse(lv.toString());
                    List<String> valuedNames = targetParamsMap.getOrDefault(targetParam.get("value"), new ArrayList<>());
                    valuedNames.add(targetParam.get("variableName").toString());
                    targetParamsMap.put(targetParam.get("value"), valuedNames);
                }

                Map<String, String> replacementMap = new HashMap<>();
                // For each old input in targetParams, find its index in oldInputs list
                for (int i = 0; i < oldInputs.size(); i++) {
                    // Find its corresponding newInput by index
                    Object newInput = newInputs.get(i);
                    Object oldInput = oldInputs.get(i);
                    // Find names of value newInput in localVariables
                    List<String> newInputNames = localVariableMap.get(newInput.toString());
                    List<String> oldInputNames = targetParamsMap.get(oldInput.toString());
                    replacementMap.put(oldInputNames.get(0), newInputNames.get(0));
                }

                Map<String, Object> infoMap = new HashMap<>();
                infoMap.put("TARGET_METHOD", TARGET);
                infoMap.put("REPLACEMENT_MAP", replacementMap);
                infoMap.put("TEST_CASE", testCaseName);
                // Replace
                cuClone.getTypes().forEach(classDec -> classDec.getMembers().forEach(method -> method.accept(new JavaParserMethodVisitor.VariableReplacementVisitor(), infoMap)));
                SourceParserFileUtils.write_normal(String.format("source_codebase/replaced_repo/%s.%s/replacement_repo/", testCaseName, ioRecordPairName), "MultTester.java", cuClone.toString());
                // TODO: instead of writing to a new repo, append to contents of TestOriginalClass.java, and finally write the whole test file to ExtendedTestOriginalClass.java
                // TODO: add main method that calls all of the tests
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
