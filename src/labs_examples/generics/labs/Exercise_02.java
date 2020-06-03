package labs_examples.generics.labs;
import java.util.*;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

class GenericArray {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        double firstArray = 0.5;
        int secondArray = 5;
        float thirdArray = 5f;
        ArrayList<Number> arrayList0 = new ArrayList();
        arrayList0.add(firstArray);
        arrayList0.add(secondArray);
        arrayList0.add(thirdArray);
        genericMethods.sumNum(arrayList0);


    }


}

class GenericMethods {

    public  <T extends Number> double sumNum(ArrayList<T> arrayList) {
        double sum = Double.parseDouble(null);
        T placeHolder = null;

        for(T element : arrayList) {
            sum = element.doubleValue() + placeHolder.doubleValue();
            placeHolder = element;
        }
        return sum;
    }
}