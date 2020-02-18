package com.epam.twothreads;

public class ThreadTest extends Thread {
    private User user;

    public ThreadTest(User user) {
        this.user = user;
    }

    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                user.print();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
