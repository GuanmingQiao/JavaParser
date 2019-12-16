package driver;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.apache.commons.cli.Options;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;
import util.SourceParserFileUtils;
import visitor.JavaParserMethodVisitor;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

public class RandoopDriver {
    static final String randoopCommandTemplate= "java -classpath %s:%s randoop.main.Main gentests " +
            "--testclass=%s " +
            "--time-limit=10 " +
            //"--omitmethods=%s " +
            "--junit-output-dir=%s " +
            "--generated-limit=100 " +
            "--omitmethods=^(.*getClass.*)$";
    private static Options options = new Options();
    static {
        options.addOption("class", true, "Fully qualified class name to be instrumented");
        options.addOption("cb", true, "Path to your bytecodebase");
        options.addOption("test_method", true, "Fully qualified method signature to generate tests for");
        //options.addOption("exclude_methods", true, "Fully qualified method signature to methods to exclude");

        options.getOption("class").setRequired(true);
        options.getOption("cb").setRequired(true);
        options.getOption("test_method").setRequired(true);
    }

    /*
     * Generate and compile Randoop tests, return test name for JUnitCore runner
     */
    public static void generateRandoopTests(String rootDir, String absoluteCodePath, String relativeCodePath, String fileName) throws Exception {
        try {
            // Guan's 1st stage
            // For each source code file:
            String outputDir = "source_codebase/randoop_tests" + rootDir.replace(".","").concat(relativeCodePath.replace(fileName, ""));
            // - use Javaparser to get package names
            CompilationUnit cu = StaticJavaParser.parse(new File(absoluteCodePath));
            String packageName = "";
            if (cu.getPackageDeclaration().isPresent()) {
                packageName = cu.getPackageDeclaration().get().toString().replace("package ", "").replace(";","").trim();
            }
            String testClass = packageName.isEmpty() ? fileName.replace(".java", "") : packageName + "." + fileName.replace(".java", "");

            // - use Javaparser to add "implement Serializable" to each class
            cu.getTypes().forEach(classDec -> classDec.accept(new JavaParserMethodVisitor.ClassDeclarationVisitor(), null));
            cu.addImport("java.io.Serializable");

            // - write the modified source code file to its equivalent dir in "temp_codebase/"
            SourceParserFileUtils.write_normal(outputDir, fileName, cu.toString());

            // - run randoopCommand with testClass = "package.class"
            // generate unit tests for target class via Randoop
            String randoop_jar = "./randoop-4.2.0/randoop-all-4.2.0.jar";
            String randoopCommand = String.format(
                    randoopCommandTemplate,
                    randoop_jar,
                    rootDir,
                    testClass,
                    //formatRegex(excludeMethods),
                    outputDir
            );

            // - move the test file to the same dir in "temp_codebase". Use package_className as test file name
            System.out.println("Randoop test generation command: \"" + randoopCommand + "\"");

            ProcessBuilder evosuitePB = new ProcessBuilder(Arrays.asList(randoopCommand.split(" ")));
            evosuitePB.inheritIO();
            Process evosuiteProcess = evosuitePB.start();
            evosuiteProcess.waitFor();

            ProcessBuilder classFileCleaner = new ProcessBuilder("/bin/sh", "-c", "find *.class  -print0 | xargs -0  rm");
            classFileCleaner.inheritIO();
            Process classFileCleanerProcess = classFileCleaner.start();
            classFileCleanerProcess.waitFor();

            ProcessBuilder testFilCleaner = new ProcessBuilder("/bin/sh", "-c", "find " + outputDir + "/RegressionTest.java -print0 | xargs -0 rm");
            testFilCleaner.inheritIO();
            Process testFileCleanerProcess = testFilCleaner.start();
            testFileCleanerProcess.waitFor();

            String testFileName = escapeString("test_" + fileName.replace(".java", "")) + ".java";

            ProcessBuilder renameFileCleaner = new ProcessBuilder("/bin/sh", "-c", "mv " + outputDir + "/RegressionTest0.java " + outputDir + "/" + testFileName);
            renameFileCleaner.inheritIO();
            Process renameFileCleanerProcess = renameFileCleaner.start();
            renameFileCleanerProcess.waitFor();

            // - use Javaparser to import Utility Files to test file
            CompilationUnit testCu = StaticJavaParser.parse(new File( outputDir + "/" + testFileName));
            testCu.addImport(packageName + ".BConverter");
            testCu.addImport(packageName + ".EMConverter");
            testCu.addImport(packageName + ".IORecord");
            testCu.addImport(packageName + ".Reporter");
            testCu.addImport(packageName +".XMLParser");
            SourceParserFileUtils.write_normal(outputDir, testFileName, testCu.toString());

            if (!packageName.isEmpty()) {
                // Import Helpers with correct package
                cu = StaticJavaParser.parse(new File( "source_codebase/saberUtil_repo/BConverter.java"));
                cu.setPackageDeclaration(StaticJavaParser.parsePackageDeclaration("package " + packageName + ";"));
                SourceParserFileUtils.write_normal(outputDir, "BConverter.java", cu.toString());

                cu = StaticJavaParser.parse(new File( "source_codebase/saberUtil_repo/EMConverter.java"));
                cu.setPackageDeclaration(StaticJavaParser.parsePackageDeclaration("package " + packageName + ";"));
                SourceParserFileUtils.write_normal(outputDir, "EMConverter.java", cu.toString());

                cu = StaticJavaParser.parse(new File( "source_codebase/saberUtil_repo/IORecord.java"));
                cu.setPackageDeclaration(StaticJavaParser.parsePackageDeclaration("package " + packageName + ";"));
                SourceParserFileUtils.write_normal(outputDir, "IORecord.java", cu.toString());

                cu = StaticJavaParser.parse(new File( "source_codebase/saberUtil_repo/Reporter.java"));
                cu.setPackageDeclaration(StaticJavaParser.parsePackageDeclaration("package " + packageName + ";"));
                SourceParserFileUtils.write_normal(outputDir, "Reporter.java", cu.toString());

                cu = StaticJavaParser.parse(new File( "source_codebase/saberUtil_repo/XMLParser.java"));
                cu.setPackageDeclaration(StaticJavaParser.parsePackageDeclaration("package " + packageName + ";"));
                SourceParserFileUtils.write_normal(outputDir, "XMLParser.java", cu.toString());
            }


            // Aditya's 2nd stage
            // For each test code file:
            // - use Javaparser to add main method to given test class
            // - use HitoshiIO to execute individual tests (probably have to manually specify -cp ALL_FILES:jUnit.jar for HitoshiIO).
            // - generate more IO Records per test case per method.
            // - use permutation to pair up original IO with new IO. Structure them like "package.TestFile.TestCaseName.MethodName/0"

            // Guan's 3rd stage
            // For each pair of IORecord
            // - use JavaParser to add xmlParser statements to its corresponding package.TestFile.TestCaseName, initializing new values
            // - use JavaParser to add monitoring statements to the testCase, recording runtime value of original variables
            // - replace old values with new values, thus creating one new testCase per IORecord
            // - put new testCases + old ones into a GIANT new test file (with correct package)
        } catch (Exception ex) {
            throw new Exception("Randoop error: ", ex);
        }
    }

    private static String escapeString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '.' || c == '(' || c == ')' || c == '[' || c == ']') {
                sb.append('\\');
            }
            sb.append(c);
        }
        return sb.toString();
    }

    private static String formatRegex(String s) {
        String result = "^(";
        String[] str = s.split(":");
        for (int i = 0; i < str.length; i++) {
            if (i > 0) {
                result += "|" + escapeString(str[i]);
            } else {
                result += escapeString(str[i]);
            }
        }
        result += ")$";
        return result;
    }

    public static void main(String args[]) throws Exception {
        try {
            String rootDir = "./source_codebase/source_repo/";

            // generate tests for all classes
            Collection<File> files = FileUtils.listFiles(
                    new File(rootDir),
                    new RegexFileFilter(".*.java"),
                    DirectoryFileFilter.DIRECTORY
            );

            String javacCommand = String.format("javac -cp json-simple-1.1.1.jar:xstream-1.4.11.jar:xstream-1.4.11.1.jar:xpp3_min-1.1.4c.jar:%s ", rootDir);
            for (File name : files) {
                if (name.getName().contains(".class")) {
                    continue;
                }
                javacCommand = javacCommand + name.getPath() + " ";
            }

            // Compile all files
            ProcessBuilder javacPB = new ProcessBuilder(Arrays.asList(javacCommand.split(" ")));
            javacPB.inheritIO();
            Process javacProcess = javacPB.start();
            javacProcess.waitFor();

            for (File f : files) {
                String relativePath = new File(rootDir).toURI().relativize(f.toURI()).getPath();
                RandoopDriver.generateRandoopTests(rootDir, f.getAbsolutePath(), relativePath, f.getName());
            }

            // - Move all monitoring/IORecord files to a top level directory inside "randoop_tests/root_dir"

            System.out.println("IODriver completed successfully.");
        } catch (Exception ex) {
            throw ex;
        }
    }
}
