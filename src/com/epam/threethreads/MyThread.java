package com.epam.threethreads;

public class MyThread extends Thread {

    public int PRINT_NUMBERS_UPTO = 21;
    static int number = 1;
    int remainder;
    static Object lock = new Object();

    MyThread(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO - 1) {
            synchronized (lock) {
                while (number % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName());
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                number++;
                lock.notifyAll();
            }
        }
    }
}
