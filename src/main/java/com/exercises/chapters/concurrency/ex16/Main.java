package com.exercises.chapters.concurrency.ex16;

import com.exercises.chapters.concurrency.ex15.MyTask1;
import com.exercises.chapters.concurrency.ex15.MyTask2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 2; i++) {
            es.submit(new MyTask1());
            es.submit(new MyTask2());
        }
        es.shutdown();
    }
}
