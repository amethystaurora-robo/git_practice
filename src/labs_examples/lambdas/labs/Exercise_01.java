package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

class Lambdas {
    public static void main(String[] args) {
        ExampleInterface exInterface = new ExampleInterface() {
            @Override
            public void run() {
                System.out.println("This is a regularly scheduled test of the anonymous inner class system.");
            }
        };

        AbstractInterface abstractInterface = new AbstractInterface() {
            @Override
            public int run(int runTime) {
                return runTime;
            }
        };

        DoubleInterface doubleInterface = new DoubleInterface() {
            @Override
            public double run(double x, double y) {
                return x*y;
            }
        };

        exInterface.run();
        abstractInterface.run(5);
        doubleInterface.run(5.5, 5.6);
    }
    @FunctionalInterface
    public interface ExampleInterface {
        public void run();
    }

    @FunctionalInterface
    public interface AbstractInterface {
        public int run(int runTime);
    }

    @FunctionalInterface
    public interface DoubleInterface {
        public double run(double x, double y);
    }


    ExampleInterface exampleInterface = () -> {System.out.println("This is a regularly scheduled test of the emergency alert" +
            "system.");};

    AbstractInterface abstractInterface = (int runTime) -> {return runTime;};

    DoubleInterface doubleInterface = (double x, double y) -> {return x*y;};

    //built-in interfaces
    BiFunction<Double, Double, Double> addDoubles = (x, y) -> {return x+y;};
    Predicate<String> shorterThan = i -> (i.length() < 5);

}

