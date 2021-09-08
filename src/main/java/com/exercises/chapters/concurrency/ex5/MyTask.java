package com.exercises.chapters.concurrency.ex5;

import com.exercises.chapters.concurrency.ex2.FibonacciProvider;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer> {
    int size;
    int sum;

    public MyTask(int num) {
        size = num;
    }

    @Override
    public Integer call() {
        for (int number : FibonacciProvider.get(size)) {
            System.out.println(sum + " += " + number);
            sum += number;
        }
        System.out.println("Finished");
        return sum;
    }
}