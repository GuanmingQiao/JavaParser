package replacement_repo;

import java.util.*;
import java.io.*;
import org.json.simple.*;

public class Reporter {
    String methodName;
    List<GenericsType<?>> targetParamList;
    List<GenericsType<?>> localVarList;

    public Reporter(String methodName) {
        this.methodName = methodName;
        this.targetParamList = new ArrayList<GenericsType<?>>();
        this.localVarList = new ArrayList<GenericsType<?>>();
    }

    public void addTargetParam(GenericsType<?> arg) {
        System.out.println("Target Parameter: <index: " + arg.getIndex() + ", variableName: " + arg.getVariableName() + ", value: "+ arg.getT() + ", methodName: " + arg.getMethodName() + ">");
        this.targetParamList.add(arg);
    }

    public void addLocalVar(GenericsType<?> arg) {
        System.out.println("Local Variable: <index: " + arg.getIndex() + ", variableName: " + arg.getVariableName() + ", value: "+ arg.getT() + ", methodName: " + arg.getMethodName() + ">");
        this.localVarList.add(arg);
    }

    public void report() {
        JSONObject obj = new JSONObject();

        JSONArray jsonArray = new JSONArray();
        obj.put("targetParam", jsonArray);
        for (GenericsType g : targetParamList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("index", g.getIndex());
            jsonObject.put("variableName", g.getVariableName());
            jsonObject.put("value", g.getT().toString());
            jsonObject.put("methodName", g.getMethodName());
            jsonArray.add(jsonObject.toString());
        }

        JSONArray localVariableJsonArray = new JSONArray();
        obj.put("localVar", localVariableJsonArray);
        for (GenericsType g: localVarList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("index", g.getIndex());
            jsonObject.put("variableName", g.getVariableName());
            jsonObject.put("value", g.getT().toString());
            jsonObject.put("methodName", g.getMethodName());
            localVariableJsonArray.add(jsonObject.toString());
        }

        try {
            int index = 0;
            while (true) {
                String filePathString = String.format("./source_codebase/runtime_result_repo/%s.%d.json", methodName, index);
                File f = new File(filePathString);

                if (f.exists() && !f.isDirectory()) {
                    return;
                }
                FileWriter file = new FileWriter(filePathString);
                file.write(obj.toJSONString());
                file.flush();
                file.close();
                break;
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}

class GenericsType<T> {
    public T t;
    public String methodName;
    public String variableName;
    public int index;

    public void set(T t, String variableName, String methodName, int index) {
        this.t = t;
        this.methodName = methodName;
        this.variableName = variableName;
        this.index = index;
    }
    public T getT() { return t; }
    public String getMethodName() { return methodName; }
    public String getVariableName() { return variableName; }
    public int getIndex() { return index; }
}