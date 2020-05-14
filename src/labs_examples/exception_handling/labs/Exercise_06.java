package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class throwingExample {
    public int throwing(int a, int b) throws ArrayIndexOutOfBoundsException {
        int c = a/b;
        return c;
    }
}

class catchingExample {
    public static void main(String[] args) {
        throwingExample throwingExample = new throwingExample();
        try {
            throwingExample.throwing(3, 5);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }

    }
}
