package com.exercises.chapters.concurrency.ex2;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            new Thread(new MyTask(10)).start();
        }
    }
}
