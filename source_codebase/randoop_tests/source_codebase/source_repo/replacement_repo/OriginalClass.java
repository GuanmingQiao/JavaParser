package replacement_repo;

import java.util.*;
import java.io.Serializable;

class CustomObject implements Serializable {

    int value;

    public CustomObject(int value) {
        this.value = value;
    }
}

public class OriginalClass implements Serializable {

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
