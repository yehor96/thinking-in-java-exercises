package com.exercises.chapters.containers.ex27;

import java.util.LinkedList;
import java.util.Queue;

public class Filler {

    public static Queue<Command> fillCommands() {

        Queue<Command> queue = new LinkedList<>();

        queue.offer(new Command("text1"));
        queue.offer(new Command("text2"));
        queue.offer(new Command("text3"));
        queue.offer(new Command("text4"));
        queue.offer(new Command("text5"));
        queue.offer(new Command("text6"));
        queue.offer(new Command("text7"));
        queue.offer(new Command("text8"));

        return queue;
    }
}
