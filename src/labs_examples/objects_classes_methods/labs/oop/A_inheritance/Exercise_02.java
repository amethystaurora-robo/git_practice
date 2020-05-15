package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: 10 prints because B extends A. B a = new B(); would result in 20
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        System.out.println(a.i);
        System.out.println(b.i);
    }
}