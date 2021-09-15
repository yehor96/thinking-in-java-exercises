package com.exercises.chapters.concurrency.ex12;

public class Atomicity {
    int i;
    void f1() { i++; }
    void f2() { i += 3; }
}
