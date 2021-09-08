package com.exercises.chapters.concurrency.ex4;

import com.exercises.chapters.concurrency.ex2.MyTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            es.execute(new MyTask(10));
        }
        es.shutdown();
    }
}
