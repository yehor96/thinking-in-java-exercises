package com.exercises.chapters.concurrency.ex12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicityTest implements Runnable {
    private int i = 0;

    public synchronized int getValue() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        i++;
    }

    public void run() {
        while (true)
            evenIncrement();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while (true) {
            int val = at.getValue();
            System.out.println(val);
            if (val % 2 != 0) {
                System.out.println("error!!! - " + val);
                System.exit(0);
            }
        }
    }
}