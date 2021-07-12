package com.exercises.chapters.containers.ex28;

import java.util.PriorityQueue;
import java.util.Random;

public class Priority {
    public static Random random = new Random();

    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            var val = random.nextDouble();
            System.out.println(val);
            queue.offer(val);
        }

        System.out.println();

        var size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(queue.poll());
        }

        System.out.println(queue);

    }
}
