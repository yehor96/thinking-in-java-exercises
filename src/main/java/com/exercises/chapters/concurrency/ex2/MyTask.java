package com.exercises.chapters.concurrency.ex2;

public class MyTask implements Runnable {
    int size;

    public MyTask(int num) {
        size = num;
    }

    @Override
    public void run() {
        for (int number : FibonacciProvider.get(size)) {
            System.out.println(number + " ");
        }
        System.out.println("Finished");
    }
}
