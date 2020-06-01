package labs_examples.multi_threading.labs;
import java.io.IOException;
import java.util.*;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class myThread implements Runnable {
    Thread thread;
    ArrayList<String> thisArray = new ArrayList();
    @Override
    public void run() {
        thisArray.add("Hi");
        thisArray.add("I");
        thisArray.add("am");
        thisArray.add("a");
        thisArray.add("happy");
        thisArray.add("alien");
        addInfo();
        subInfo();
        System.out.println(thisArray.toString());
    }

    public ArrayList<String> addInfo() {
        thisArray.add("robot");
        return thisArray;
    }

    public ArrayList<String> subInfo() {
        thisArray.remove(0);
        return thisArray;
    }

    public static void main(String[] args) {
        myThread thread = new myThread();
        myThread thread1 = new myThread();
        synchronized (thread) {
            thread.run();
            thread1.run();
        }


    }
}