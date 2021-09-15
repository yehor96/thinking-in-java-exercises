package com.exercises.chapters.concurrency.ex11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 10000; i++) {
            es.submit(new MyTask(container));
        }
        es.shutdown();
    }
}
