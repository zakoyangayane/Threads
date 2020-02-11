package com.epam.timer;

import java.util.Date;

public class Timer extends Thread {
    Date date = new Date();

    @Override
    public void run() {
        System.out.println(date);
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        date = new Date();
        System.out.println(date);
    }
}
