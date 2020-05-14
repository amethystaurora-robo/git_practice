package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class tryCatchFinally {
    public static void main(String[] args) {
        int[] numList = {3, 0, 5, 7};
        try {
            System.out.println(numList[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There aren't that many numbers in the array");
        } finally {
            System.out.println("You did it.");
        }
    }
}