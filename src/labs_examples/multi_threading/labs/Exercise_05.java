package labs_examples.multi_threading.labs;
import java.util.*;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class myThread0 implements Runnable {
    Thread thread;
    boolean isReady = false;
    @Override
    public synchronized void run() {
        while (isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isReady = true;
        notify();
    }
    public synchronized static void main(String[] args) {
        myThread0 myThread = new myThread0();
        myThread.run();
    }

}