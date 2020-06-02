package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class MyGeneric <T, V> {
    T valOne;
    V valtwo;

    public T getValOne() {
        return valOne;
    }

    public void setValOne(T valOne) {
        this.valOne = valOne;
    }

    public V getValtwo() {
        return valtwo;
    }

    public void setValtwo(V valtwo) {
        this.valtwo = valtwo;
    }
}

class RunGenerics {
    public static void main(String[] args) {
        
    }
}

