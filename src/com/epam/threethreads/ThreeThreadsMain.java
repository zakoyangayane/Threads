package com.epam.threethreads;

public class ThreeThreadsMain {
    public static void main(String[] args) {
        FirstThread first = new FirstThread();
        first.setName("Thread1");
        FirstThread second = new FirstThread();
        second.setName("Thread2");
        FirstThread third = new FirstThread();
        third.setName("Thread3");

        for (int i = 0; i < 21; i++) {
            if (i == 0) {
                try {
                    first.start();
                    first.join();
                    second.start();
                    second.join();
                    third.start();
                    third.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    first.join();
                    second.join();
                    third.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

//        SecondThread secondThread = new SecondThread();
//        secondThread.start();
//        Thread thirdThread = new Thread(new ThirdThread());
//        thirdThread.start();

//        try {
//            // First thread
//            firstThread.start();
//            firstThread.join();
//            // Second thread
//            secondThread.start();
//            secondThread.join();
//            // Third thread
//            thirdThread.start();
//            thirdThread.join();
//        } catch (InterruptedException e) {
//             TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }
}
