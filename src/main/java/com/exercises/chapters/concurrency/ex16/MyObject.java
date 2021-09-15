package com.exercises.chapters.concurrency.ex16;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyObject {
    static final Object obj1 = new Object();
    static final Object obj2 = new Object();

    @SneakyThrows
    public void method1() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println("Inside sync method1");
            Thread.sleep(2000);
        } finally {
            lock.unlock();
        }
    }

    @SneakyThrows
    public void method2() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println("Inside sync method2");
            Thread.sleep(2000);
        } finally {
            lock.unlock();
        }
    }
}
