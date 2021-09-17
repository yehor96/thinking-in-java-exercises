package com.exercises.chapters.concurrency.ex18;

public class MyTask implements Runnable {

    int value = 0;

    @Override
    public void run() {
        System.out.println("Starting run and assigning value to 5");
        value = 5;
        try {
            Waiter.letsWait();
            System.out.println("Wait has ended and value is " + value);
        } catch (InterruptedException e) {
            System.out.println("Interrupted! Setting value back to 0");
            value = 0;
            throw new RuntimeException(e);
        }
    }
}
