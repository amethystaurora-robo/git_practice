package labs_examples.conditions_loops.labs;
import java.util.Scanner;
import java.util.*;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String userString = Scanner.nextLine();
        String userString = "cat";
        int i = 0;
        String vowels = "aeiou";

        System.out.println("Please enter a string.");

        while (i < userString.length()) {
            if (vowels.contains(String.valueOf(userString.charAt(i)))) {
                System.out.println(userString.charAt(i));
            }
            i++;
        }

    }
}
