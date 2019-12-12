package util;

import java.util.Set;

public class MonitorInfo{
    private String targetMethod;
    private String testCase;
    private Set<LocalVariable> localVariables;

    public MonitorInfo(String targetMethod, String testCase, Set<LocalVariable> localVariables) {
        this.targetMethod = targetMethod;
        this.testCase = testCase;
        this.localVariables = localVariables;
    }

    public String getTargetMethod() {
        return this.targetMethod;
    }

    public Set<LocalVariable> getLocalVariables() {
        return this.localVariables;
    }

    public void setTargetMethod(String targetMethod) {
        this.targetMethod = targetMethod;
    }

    public String getTestCase() { return this.testCase; }

    public void setTestCase(String testCase) { this.testCase = testCase; }

    public void setLocalVariables(Set<LocalVariable> localVariables) {
        this.localVariables = localVariables;
    }
}