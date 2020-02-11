package com.epam.threethreads;

import java.util.concurrent.TimeUnit;

public class SecondThread extends Thread {
    public void run() {
        for (int i = 0; i < 21; i++) {
            System.out.println("SecondThread");
            try {
                TimeUnit.SECONDS.sleep(3);
                Thread thirdThread = new Thread(new ThirdThread());
                thirdThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
