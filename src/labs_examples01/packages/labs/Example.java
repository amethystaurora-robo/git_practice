package labs_examples01.packages.labs;
import labs_examplest02.packages.labs.*;

public class Example {
    public void addNum(int a, int b) {
        int c = a + b;
    }

    protected int subNum(int a, int b) {
        int c = a-b;
        return c;
    }
    public static void main(String[] args) {
        Exampletwo exampletwo = new Exampletwo();

        //this works because it is public
        exampletwo.returnTrue();

        //this doesn't work because it's protected
        //exampletwo.returnFalse();

    }


}
