package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class MyThread extends Thread {
    public void run(String name) {
        System.out.println("I am a happy " + name);
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.run("alien");
        //set priority from Exercise 3
        myThread1.setPriority(5);
        myThread1.run("robot");
    }

}
