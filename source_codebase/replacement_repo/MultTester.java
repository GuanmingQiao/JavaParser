package replacement_repo;

import java.util.*;


public class MultTester {

    public static void test0() {
        // Original Initialization
        int length = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }

        CustomObject object = new CustomObject(5);

        OriginalClass originalClass = new OriginalClass();

        originalClass.originalMethod(list);
    }

    public static void test1() {
        // Original Initialization
        int length = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }

        CustomObject object = new CustomObject(5);

        OriginalClass originalClass = new OriginalClass();

        originalClass.originalMethod(list);
    }

    public static void main(String[] args) {
        test0();
        test1();
    }
}