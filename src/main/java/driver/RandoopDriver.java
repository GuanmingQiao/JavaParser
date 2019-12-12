package driver;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import java.util.Arrays;

public class RandoopDriver {
    static final String randoopCommandTemplate= "java -classpath %s:%s randoop.main.Main gentests " +
            "--testclass=%s " +
            "--time-limit=10 " +
            "--omitmethods=%s " +
            "--junit-output-dir=%s " +
            "--generated-limit=10 " +
            "--omitmethods=^(.*getClass.*)$";
    private static Options options = new Options();
    static {
        options.addOption("class", true, "Fully qualified class name to be instrumented");
        options.addOption("cb", true, "Path to your bytecodebase");
        options.addOption("test_method", true, "Fully qualified method signature to generate tests for");
        options.addOption("exclude_methods", true, "Fully qualified method signature to methods to exclude");

        options.getOption("class").setRequired(true);
        options.getOption("cb").setRequired(true);
        options.getOption("test_method").setRequired(true);
        options.getOption("exclude_methods").setRequired(true);
    }

    /*
     * Generate and compile Randoop tests, return test name for JUnitCore runner
     */
    public static void generateRandoopTests(String sourceCodePath, String testClass, String excludeMethods, String testMethod) throws Exception {
        try {
            // generate tests for target methods via Randoop
            String randoop_jar = "./randoop-4.2.0/randoop-all-4.2.0.jar";
            String PATH = "./temp_codebase/";
            String directoryName = PATH.concat(testClass);
            String randoopCommand = String.format(
                    randoopCommandTemplate,
                    randoop_jar,
                    sourceCodePath,
                    testClass,
                    formatRegex(excludeMethods),
                    directoryName
            );
            System.out.println("Randoop test generation command: \"" + randoopCommand + "\"");

            ProcessBuilder evosuitePB = new ProcessBuilder(Arrays.asList(randoopCommand.split(" ")));
            evosuitePB.inheritIO();
            Process evosuiteProcess = evosuitePB.start();
            evosuiteProcess.waitFor();

            ProcessBuilder classFileCleaner = new ProcessBuilder("/bin/sh", "-c", "find *.class  -print0 | xargs -0  rm");
            classFileCleaner.inheritIO();
            Process classFileCleanerProcess = classFileCleaner.start();
            classFileCleanerProcess.waitFor();

            ProcessBuilder testFilCleaner = new ProcessBuilder("/bin/sh", "-c", "find " + directoryName + "/RegressionTest.java -print0 | xargs -0 rm");
            testFilCleaner.inheritIO();
            Process testFileCleanerProcess = testFilCleaner.start();
            testFileCleanerProcess.waitFor();

            ProcessBuilder renameFileCleaner = new ProcessBuilder("/bin/sh", "-c", "mv " + directoryName + "/RegressionTest0.java " + directoryName + "/" + escapeString(testMethod) + ".java");
            renameFileCleaner.inheritIO();
            Process renameFileCleanerProcess = renameFileCleaner.start();
            renameFileCleanerProcess.waitFor();
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
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(options, args);

            String className = cmd.getOptionValue("class");
            String excludeMethods = cmd.getOptionValue("exclude_methods");
            String testMethod = cmd.getOptionValue("test_method");
            String sourceCodePath = cmd.getOptionValue("cb");

            // add codebase to classpath
            if (!cmd.hasOption("cb")) {
                System.out.println("Could not find -cb option; please include path to bytecodebase. Exiting now...");
                System.exit(-1);
            }

            // for now, executes only the specified method
            System.out.println("Executing target method " + testMethod + " for " + className);

            // generate tests for method
            RandoopDriver.generateRandoopTests(sourceCodePath, className, excludeMethods, testMethod);

            System.out.println("IODriver completed successfully.");
        } catch (Exception ex) {
            throw ex;
        }
    }
}
