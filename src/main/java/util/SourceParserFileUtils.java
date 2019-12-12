package util;

import com.github.javaparser.ast.CompilationUnit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SourceParserFileUtils {
    public static void write(String dirName, String fileName, String content) {
        File directory = new File(dirName + fileName.substring(0, fileName.lastIndexOf("/") == -1 ? fileName.length() : fileName.lastIndexOf("/")));
        directory.mkdirs();

        File file = new File(dirName + fileName);
        try{
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }
        catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void write_normal(String dirName, String fileName, String content) {
        File directory = new File(dirName);
        directory.mkdirs();

        File file = new File(dirName + fileName);
        try{
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }
        catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void writeAll(Map<String, CompilationUnit> allStates, String outputDir) {
        allStates.keySet().forEach( path -> {
            String fileName = path.replaceAll("source_codebase", "");
            write(outputDir, fileName, allStates.get(path).toString());
        });
    }
}
