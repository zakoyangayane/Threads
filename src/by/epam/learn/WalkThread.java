package by.epam.learn;

import java.util.concurrent.TimeUnit;

public class WalkThread extends Thread {
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Walk " + i);
            try {
                TimeUnit.NANOSECONDS.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
