package com.epam.threethreads;

import java.util.concurrent.TimeUnit;

public class FirstThread extends Thread {
    public void run() {
//        for (int i = 0; i < 21; i++) {

            try {

//                SecondThread secondThread = new SecondThread();
//                secondThread.join();
              System.out.println(this.getName());
              TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//        }
    }
}
