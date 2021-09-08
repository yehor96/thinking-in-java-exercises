package com.exercises.chapters.concurrency.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        final int size = 5;
        List<Future<Integer>> results = new ArrayList<>();
        ExecutorService es = Executors.newFixedThreadPool(size);
        for (int i = 0; i < size; i++) {
            results.add(es.submit(new MyTask(10)));
        }

        for (var each : results) {
            try {
                System.out.println(each.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            } finally {
                es.shutdown();
            }
        }
    }
}
