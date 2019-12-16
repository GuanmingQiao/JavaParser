package replacement_repo;

import java.util.*;

class CustomObject {
    int value;
    public CustomObject(int value) {
        this.value = value;
    }
}

public class OriginalClass {
    public int originalMethod(List<Integer> list) {
        int res = 0;
        for (int i : list) {
            res += i;
        }
        return res;
    }

    public OriginalClass() {

    }
}
