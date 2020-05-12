package labs_examples.static_nonstatic.labs;

public class StaticPractice {

    //static calling static
    public static int addNum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void callAdd() {
        addNum(3, 5);
    }

    //static calling non-static
    public int subNum(int a, int b) {
        int c = a - b;
        return c;
    }

    public static void callSub() {
        StaticPractice staticPractice = new StaticPractice();
        staticPractice.subNum(5, 3);
    }

    //static calling static in other class
    public static void callDiv() {
        otherClass.divNum(5, 5);
    }

    //static calling non-static in other class
    public static void callMult() {
        otherClass otherClass = new otherClass();
        otherClass.multNum(5, 5);
    }

    //non-static calling non-static in other class
    public void callOtherMult() {
        otherClass otherClass = new otherClass();
        otherClass.multNum(5, 5);
    }

    //non-static calling static in other class
    public void callOtherDiv() {
        otherClass.divNum(5, 5);
    }
}

class otherClass {

    //non-static calling non-static, same class
    public void callMultNum() {
        multNum(5, 5);
    }

    //non-static calling static in same class
    public void callSameDiv() {
        divNum(5, 5);
    }

    public static int divNum(int a, int b) {
        int c = a/b;
        return c;
    }

    public int multNum(int a, int b) {
        int c = a*b;
        return c;
    }
}
