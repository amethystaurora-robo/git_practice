package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        double pi = 3.141519;
        int height = 5;
        double cylVolume = 2*height*pi*(height + radius);
        double cylArea = radius*radius*pi*height;
        System.out.println(cylVolume);
        System.out.println(cylArea);


    }
}