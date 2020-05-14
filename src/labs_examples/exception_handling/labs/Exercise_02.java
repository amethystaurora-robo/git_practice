package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


class manyCatch {
    public static void main(String[] args) {
        int[] numList = {3, 0, 5, 7, 9};
        try {
            System.out.println(numList[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Oops. There aren't that many numbers in the list.");
        } catch (Exception f) {
            System.out.println("A problem has occurred.");
        }
    }
}
