package com.exercises.chapters.concurrency.ex1;

public class MyTask implements Runnable {

    public MyTask() {
        System.out.println("Starting MyTask");
    }

    @Override
    public void run() {
        System.out.println("Running");
        Thread.yield();
        System.out.println("Running");
        Thread.yield();
        System.out.println("Running");
        Thread.yield();
        System.out.println("Shutting down MyTask");
    }
}
