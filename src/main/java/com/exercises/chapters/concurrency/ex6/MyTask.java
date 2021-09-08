package com.exercises.chapters.concurrency.ex6;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MyTask implements Runnable {

    final Random random = new Random();

    @Override
    public void run() {
        try {
            final int sleep = getFrom0to10();
            TimeUnit.SECONDS.sleep(sleep);
            System.out.println("Sleep time " + sleep + " seconds");
        } catch (InterruptedException e) {
            throw new IllegalStateException("Sleep was interrupted");
        }
    }

    public int getFrom0to10() {
        int sleep;
        do {
            sleep = random.nextInt(11);
        } while (sleep == 0);
        return sleep;
    }
}
