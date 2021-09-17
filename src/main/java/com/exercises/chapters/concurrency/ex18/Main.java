package com.exercises.chapters.concurrency.ex18;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyTask());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
