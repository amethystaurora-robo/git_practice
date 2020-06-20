package labs_examples.lambdas.labs;

import java.util.function.Function;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class MethodReferences {
    @FunctionalInterface
    interface ThisInterface {
        void run();
    };

    @FunctionalInterface
    interface UserGenerator{
       User createUser(int dogNum, int plantNum);
    }

    public void thisMethod() {
        System.out.println("This is a test.");}

    public static void main (String[] args) {

        //static method reference
        Function<Integer, Integer> returnInt = (myInt) -> {
            return myInt;
        };
        int b = returnInt.apply(5);
        System.out.println(b);

        //instance method reference
        MethodReferences methodReferences = new MethodReferences();
        ThisInterface thisInterface = methodReferences::thisMethod;
        thisInterface.run();

        //constructor reference
        UserGenerator userGenerator = User :: new;
        User me = userGenerator.createUser(2, 50);
        me.toString();

    }

}

class User{
    int dogNum;
    int plantNum;

    public User(int dogNum, int plantNum){
        this.dogNum = dogNum;
        this.plantNum = plantNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "dogNum='" + dogNum + '\'' +
                ", plantNum='" + plantNum + '\'' +
                '}';
    }
}