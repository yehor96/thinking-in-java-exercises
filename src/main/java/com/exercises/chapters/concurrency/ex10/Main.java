package com.exercises.chapters.concurrency.ex10;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.exercises.chapters.concurrency.ex10.MyTask.runTask;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newCachedThreadPool();
        System.out.println(es.submit(runTask(5)).get());
        System.out.println(es.submit(runTask(41)).get());
        System.out.println(es.submit(runTask(44)).get());
        es.shutdown();
    }
}
