package com.exercises.chapters.containers.ex29;

import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<MyObj> queue = new PriorityQueue<>();

        queue.add(new MyObj());
        queue.add(new MyObj());
        queue.add(new MyObj());

        System.out.println(queue);
    }

}
