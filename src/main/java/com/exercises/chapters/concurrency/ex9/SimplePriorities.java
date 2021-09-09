package com.exercises.chapters.concurrency.ex9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;

    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    public void run() {
        while (true) {
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new CustomFactory(Thread.MIN_PRIORITY));
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePriorities());
        }
        exec.shutdown();
    }

    static class CustomFactory implements ThreadFactory {

        final int priority;

        public CustomFactory(int priority) {
            this.priority = priority;
        }

        @Override
        public Thread newThread(Runnable r) {
            var thread = new Thread(r);
            thread.setPriority(priority);
            return thread;
        }
    }
}
