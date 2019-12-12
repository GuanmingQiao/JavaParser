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
        XMLParser xmlParser = new XMLParser("/Users/guanmingqiao/Documents/GitHub/source-parser/./source_codebase/io_record_repo/replacement_repo.MultTester.test0.originalMethod/1");
        java.util.ArrayList newInput0 = (java.util.ArrayList) xmlParser.getNewInputByIndex(0);
        // Original Initialization
        int length = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        CustomObject object = new CustomObject(5);
        originalMethod(newInput0);
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
