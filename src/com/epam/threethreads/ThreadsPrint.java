package com.epam.threethreads;

public class ThreadsPrint {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread(1);
        MyThread myThread2 = new MyThread(2);
        MyThread myThread3 = new MyThread(0);

        Thread thread1 = new Thread(myThread1, "One");
        Thread thread2 = new Thread(myThread2, "Two");
        Thread thread3 = new Thread(myThread3, "Three");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
