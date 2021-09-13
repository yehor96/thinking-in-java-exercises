package com.exercises.chapters.concurrency.ex11;

public class Container {

    private int value1 = 1;
    private int value2 = 2;

    public synchronized String getText() {
        ++value1;
        ++value1;
        ++value2;
        ++value2;
        return value1 + " " + value2;
    }
}
