package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class ThisThread implements Runnable {
    Thread thread;

    public void run(int integer) {
        System.out.println("Printing thread number " + integer);
    }

    public static void main(String[] args) {
        ThisThread thread1 = new ThisThread();
        ThisThread thread2 = new ThisThread();
        for(int count = 0; count <= 100; count+=2) {
            thread1.run(count);
            if (count + 1 < 101) {
                thread2.run(count + 1);
            }

        }
    }

    @Override
    public void run() {

    }
}