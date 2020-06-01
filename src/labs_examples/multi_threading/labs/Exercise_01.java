package labs_examples.multi_threading.labs;
import java.util.*;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class myClass implements Runnable {
    Thread thread;
    @Override
    public void run() {
        System.out.println("I am a happy alien.");
    }
    public static void main(String[] args) {
        Thread myThread = new Thread();
        myThread.run();
    }

}


