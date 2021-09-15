package com.exercises.chapters.concurrency.ex14;

import java.util.Timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int length = 3;

        for (int i = 0; i < length; i++) {
            new Timer().scheduleAtFixedRate(new MyTask(i), 500L, 3000L);
        }
        Thread.sleep(10000L * length);
        System.out.println("The end.");
        System.exit(0);
    }
}
