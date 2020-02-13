package com.epam.threadpool;

public class ThreadPool {
    private volatile int activeThreadsCount;
    private int size;

    public ThreadPool(int size) {
        this.size = size;
    }

    public synchronized MyThread getThread() {
        if (activeThreadsCount >= size) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("Attempt was interapted , retrying!!!");
                return getThread();
            }
        }
        activeThreadsCount++;
        return new MyThread(this);
    }

    public synchronized void descreaseSize() {
        activeThreadsCount--;
        this.notifyAll();
    }

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(3);
        for (int i = 0; i < 10; i++) {
            pool.getThread().runJob(() -> {
                System.out.println(Thread.currentThread().getName() + ": I started");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": I finished");
            });
        }
    }
}
