package labs_examples.lambdas.labs;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class FunctionalInterfaces {
    public static void main(String[] args) {
        demonstrateInterfaces();

    }

    public static void demonstrateInterfaces()

    {
        Function<Integer, Integer> returnInt = (myInt) -> {
            return myInt;
        };
        BiFunction<Integer, Integer, Integer> returnSum = (myInt, yourInt) -> {
            return myInt + yourInt;
        };
        Predicate<Boolean> returnTrue = (amSad) -> {
            return true;
        };
        UnaryOperator<String> returnString = (myString) -> {
            return myString;
        };
        BinaryOperator<Integer> returnDifference = (val1, val2) -> {
            return val1 + val2;
        };
        Consumer<Integer> printVal = (valOne) -> {
            System.out.println(valOne);
        };
        Consumer<String> printString = (myString) -> {
            System.out.println(myString);
        };
        Supplier<Integer> makeVal = () -> {
            return new Integer(5);
        };
        Supplier<String> makeString = () -> {
            return new String("Hello world");
        };
        BiFunction<Integer, Integer, Integer> returnTimes = (thisInt, thatInt) -> {
            return thisInt * thatInt;
        };
    }

}