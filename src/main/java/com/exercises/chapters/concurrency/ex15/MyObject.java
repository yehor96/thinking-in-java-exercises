package com.exercises.chapters.concurrency.ex15;

import lombok.SneakyThrows;

public class MyObject {

    static final Object obj1 = new Object();
    static final Object obj2 = new Object();

    @SneakyThrows
    public void method1() {
        synchronized (obj1) {
            System.out.println("Inside sync method1");
            Thread.sleep(2000);
        }
    }

    @SneakyThrows
    public void method2() {
        synchronized (obj1) {
            System.out.println("Inside sync method2");
            Thread.sleep(2000);
        }
    }
}
