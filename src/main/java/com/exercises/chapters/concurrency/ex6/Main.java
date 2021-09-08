package com.exercises.chapters.concurrency.ex6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//{Args: 10}
public class Main {
    public static void main(String[] args) {
        final int quantity = getQuantity(args);
        ExecutorService es = Executors.newFixedThreadPool(quantity);
        for (int i = 0; i < quantity; i++) {
            es.execute(new MyTask());
        }
        es.shutdown();
    }

    public static int getQuantity(String args[]) {
        try {
            return Integer.parseInt(args[0]);
        } catch (Exception e) {
            throw new IllegalArgumentException("Make sure to pass only one integer as a program argument");
        }
    }
}
