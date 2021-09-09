package com.exercises.chapters.concurrency.ex8;

public class MoreBasicThreads {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            var thread = new Thread(new LiftOff());
            thread.setDaemon(true);
            thread.start();
        }

        System.out.println("Waiting for LiftOff");
        Thread.sleep(50);
    }
}
