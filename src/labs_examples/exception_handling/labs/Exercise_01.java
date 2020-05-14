package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class tryCatchExample {
    public static void main(String[] args) {
        int[] numList = {3, 5, 7, 9, 0};
        try {
            int c = numList[1]/numList[4];
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

}

