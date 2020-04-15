package labs_examples.arrays.labs;
import java.util.ArrayList;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] multiArray = new int[10][5];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j ++) {
                multiArray[i][j] = i;
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }



    }

}
