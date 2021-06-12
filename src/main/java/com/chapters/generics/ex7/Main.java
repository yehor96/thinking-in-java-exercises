package com.chapters.generics.ex7;

public class Main {
    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (var val : gen.new FibonacciIterator(10))
            System.out.print(val + " ");
    }
}
