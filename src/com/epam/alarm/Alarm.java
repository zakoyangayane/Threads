package com.epam.alarm;

import java.time.LocalDateTime;
import java.util.Date;

public class Alarm extends Thread {
    LocalDateTime localDateTime;

    public Alarm(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public void run() {
        System.out.println("waiting for your alarm...");
        while (localDateTime.isAfter(LocalDateTime.now())) {
        }
        Date date = new Date();
        System.out.println("Your Alarm!!! " + date);
    }
}
