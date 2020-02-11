package com.epam.threethreads;

import java.util.concurrent.TimeUnit;

public class ThirdThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 21; i++) {
            System.out.println("ThirdThread");
            try {
                TimeUnit.SECONDS.sleep(4);
                FirstThread firstThread=new FirstThread();
                firstThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
