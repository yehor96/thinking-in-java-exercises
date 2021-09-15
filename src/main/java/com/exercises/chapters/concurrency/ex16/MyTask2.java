package com.exercises.chapters.concurrency.ex16;

public class MyTask2 implements Runnable {

    final MyObject obj = new MyObject();

    @Override
    public void run() {
        obj.method2();
        obj.method1();
    }
}
