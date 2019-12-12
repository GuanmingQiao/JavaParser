package source_repo;

public class MultTester {
    public int c; //if it's not final, it's not a constant, and it SHOULD be an input!

    public int add_values(int[] a) {
        return c + 42;
    }

    public boolean foo(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public void setC (int c) {
        this.c = c;
    }

    public MultTester() {

    }
}