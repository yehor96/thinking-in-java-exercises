package com.chapters.generics.ex7;

import com.chapters.typeinfo.ex12.cofee.Generator;

import java.util.Iterator;

public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public class FibonacciIterator implements Iterable<Integer> {

        int size;

        public FibonacciIterator(int size) {
            this.size = size;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<>() {
                public boolean hasNext() {
                    return count < size;
                }

                public Integer next() {
                    return Fibonacci.this.next();
                }
            };
        }
    }
}
