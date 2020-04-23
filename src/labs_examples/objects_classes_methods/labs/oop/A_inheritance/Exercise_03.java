package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 *
 * You answer: The object in the main class first references the C_1 class,
 * which extends the B-1 class, which extends the A_1 class.
 * So the compiler will stop at A_1 and print "Class A Constructor" first,
 * followed by "Class B Constructor", followed by "Class C Constructor" because
 * parent classes are accessed before child classes.
 *
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        A_1 c = new C_1();
    }
}
