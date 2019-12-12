package replacement_repo;

import java.util.*;

class CustomObject {
    int value;
    public CustomObject(int value) {
        this.value = value;
    }
}

public class MultTester {

    public static void test0() {
        // Original Initialization
        int length = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        CustomObject object = new CustomObject(5);

        originalMethod(list);
    }

    public static void test1() {
        // Original Initialization
        int length = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        CustomObject object = new CustomObject(5);

        originalMethod(list);
    }

    public static int originalMethod(List<Integer> list) {
        int res = 0;
        for (int i : list) {
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        test0();
        test1();
    }
}