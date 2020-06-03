package labs_examples.generics.labs;

import java.util.Collection;
import java.util.Collections;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class BoundedGenerics {
    public static void main(String[] args) {
        BoundedGenerics boundedGenerics = new BoundedGenerics();
        boundedGenerics.returnSum(5, 5.5);

    }

    public <T extends Number> double returnSum(T firstArg, T secondArg) {
        double sum = 0.0;
        sum = firstArg.doubleValue() + secondArg.doubleValue();
        return sum;
    }

    public <V extends Collection> int returnNum(V collection) {
        int totalElements = 0;
        for(Object c : collection) {
            totalElements++;
        }
        return totalElements;
    }


        }