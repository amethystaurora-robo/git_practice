package labs_examples.exception_handling.labs;
import java.util.*;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class notMineException extends Exception {
    public void notMine() {
        System.out.println("this is not mine. Take it.");
    }
}

class customExceptionExample {
    public static void main(String[] args) throws notMineException {
        boolean mine;
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        System.out.println("Is it yours?");
        if(userAnswer.equalsIgnoreCase("yes")) {
            throw new notMineException();
        }
        else {
            System.out.println("Give it back.");
        }


    }
}