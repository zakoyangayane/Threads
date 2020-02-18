package com.epam.threadpool;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyThread extends Thread {
    ThreadPool pool;
    Runnable job;

    public MyThread(ThreadPool p) {
        this.pool = p;
    }

    @Override
    public void run() {
        job.run();
        pool.descreaseSize();
    }

    public void runJob(Runnable job) {
        this.job = job;
        this.start();
    }
}
