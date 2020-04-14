package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in 10 numbers.");
        //int[] numList = scanner.nextInt();
        int sum = 0;
        int[] numList = {0, 5, 3, 7, 9, 10, 8, 7, 6, 5};
        int j = 0;

        for (int i = 0; i < numList.length; i++) {
            sum = numList[i] + j;
            j = numList[i] + j;
        }
        int average = sum/10;
        System.out.println("The average is " + average);
        System.out.println("The sum is " + sum);


    }

}