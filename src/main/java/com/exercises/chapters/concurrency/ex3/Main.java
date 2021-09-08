package com.exercises.chapters.concurrency.ex3;

import com.exercises.chapters.concurrency.ex1.MyTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        final int threads = 5;
        ExecutorService es = Executors.newFixedThreadPool(threads);
        for (int i = 0; i < threads; i++) {
            es.execute(new MyTask());
        }
        es.shutdown();
    }
}
