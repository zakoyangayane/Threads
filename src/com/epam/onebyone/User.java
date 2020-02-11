package com.epam.onebyone;

public class User {

    public synchronized void print() {
        try {
            System.out.println(Thread.currentThread().getName());
            this.notify();
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
