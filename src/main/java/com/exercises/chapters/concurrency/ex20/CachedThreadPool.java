package com.exercises.chapters.concurrency.ex20;

import com.exercises.chapters.concurrency.ex8.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        Thread.sleep(1);
        exec.shutdownNow();
    }
}