package com.exercises.chapters.concurrency.ex2;

import java.util.Iterator;

public class FibonacciProvider implements Iterable<Integer> {

    private final int size;
    private int count = 0;

    private FibonacciProvider(int size) {
        this.size = size;
    }

    public static FibonacciProvider get(int size) {
        return new FibonacciProvider(size);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            public boolean hasNext() {
                return count < size;
            }

            public Integer next() {
                return FibonacciProvider.this.calculateFib(count++);
            }
        };
    }

    private int calculateFib(int n) {
        if (n < 2) {
            return 1;
        }
        return calculateFib(n - 2) + calculateFib(n - 1);
    }
}