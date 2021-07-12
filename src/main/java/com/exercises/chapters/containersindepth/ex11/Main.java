package com.exercises.chapters.containersindepth.ex11;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<IntHolder> queue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(new IntHolder());
        }

        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
    }
}
