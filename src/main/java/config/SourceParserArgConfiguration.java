package config;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class SourceParserArgConfiguration {
    public final static String SOURCE_CODE_PATH_ARG = "sourcePath";
    public final static String SOURCE_CODE_PATH_ARG_DES = "Relative path to the source code repository to be parsed";
    public final static String OUTPUT_CODE_PATH_ARG = "outputPath";
    public final static String OUTPUT_CODE_PATH_ARG_DES = "Relative path to the output directory to which parsed sourcecode should be saved";
    private final static Options options = new Options();

    static {
        Option sourcecodePathOption = new Option(SOURCE_CODE_PATH_ARG, SOURCE_CODE_PATH_ARG_DES);
        sourcecodePathOption.setRequired(true);
        sourcecodePathOption.setArgs(1);
        options.addOption(sourcecodePathOption);

        Option outputCodePathOption = new Option(OUTPUT_CODE_PATH_ARG, OUTPUT_CODE_PATH_ARG_DES);
        outputCodePathOption.setRequired(false);
        outputCodePathOption.setArgs(1);
        options.addOption(outputCodePathOption);
    }

    public static Options getOptions() {
        return options;
    }
}
