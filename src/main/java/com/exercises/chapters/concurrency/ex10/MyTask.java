package com.exercises.chapters.concurrency.ex10;

import com.exercises.chapters.concurrency.ex2.FibonacciProvider;

import java.util.concurrent.Callable;

public class MyTask {

    public static Callable<Integer> runTask(int size) {
        return new Callable<>() {
            int sum = 0;
            @Override
            public Integer call() {
                for (int number : FibonacciProvider.get(size)) {
                    sum += number;
                }
                return sum;
            }
        };
    }
}
