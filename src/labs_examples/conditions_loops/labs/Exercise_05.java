package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers.");
        //int userNum = Scanner.nextInt();
        //int usernumNext = Scanner.nextInt();
        int userNum = 3;
        int usernumNext = 5;
        int sum = userNum + usernumNext;
        int average = (userNum + usernumNext)/2;


        for (int i = userNum; i < usernumNext -1; i++) {
            sum += sum;
        }
        System.out.println("The sum is " + sum);
        for (int i = userNum; i < usernumNext-1; i++) {

            average += average;

        }
        System.out.println("The average is " + average);



    }
}
