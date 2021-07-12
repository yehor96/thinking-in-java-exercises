package com.exercises.chapters.containers.ex14;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Instant start = Instant.now();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(list.size()/2, i);
        }
        System.out.println(list);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
}
