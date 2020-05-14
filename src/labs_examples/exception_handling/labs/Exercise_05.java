package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class throwExample {
    public static void main(String[] args) {
        int[] numList = {0, 0, 0, 0};
        int i = 0;
            System.out.println(numList[i]);
            if (numList[i] > numList.length) {
                throw new ArrayIndexOutOfBoundsException();
            }

    }
}
