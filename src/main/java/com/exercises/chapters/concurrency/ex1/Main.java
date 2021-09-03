package com.exercises.chapters.concurrency.ex1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyTask()).start();
        }
    }
}
