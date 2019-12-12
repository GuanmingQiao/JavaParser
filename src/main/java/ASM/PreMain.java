package ASM;

import java.lang.instrument.Instrumentation;

public class PreMain {
    public static void premain (String agentArgs, Instrumentation inst) throws Exception {
        DemoTransformer demoTransformer = new DemoTransformer();
        inst.addTransformer(demoTransformer);
    }
}