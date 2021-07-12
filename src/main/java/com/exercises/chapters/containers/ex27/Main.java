package com.exercises.chapters.containers.ex27;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        var queue = Filler.fillCommands();
        consumeQueue(queue);
    }

    public static void consumeQueue(Queue<Command> queue) {
        queue.forEach(Command::operation);
    }
}
