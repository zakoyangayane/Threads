package com.epam.onebyone;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        ThreadTest threadTest1 = new ThreadTest(user);
        threadTest1.setName("A");
        ThreadTest threadTest2 = new ThreadTest(user);
        threadTest2.setName("B");
        threadTest1.start();
        threadTest2.start();
    }
}
