package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class nestedTryCatch {
    public static void main(String[] args) {
        int[] numList = {3, 0, 3, 5};
        try {
            System.out.println(numList[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There aren't that many numbers in the list");
        } try {
            System.out.println(numList[3]);
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println("Try again");
        }
    }
}
