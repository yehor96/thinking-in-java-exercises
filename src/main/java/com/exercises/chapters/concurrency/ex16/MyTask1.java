package com.exercises.chapters.concurrency.ex16;

public class MyTask1 implements Runnable {
    final MyObject obj = new MyObject();

    @Override
    public void run() {
        obj.method1();
        obj.method2();
    }
}
