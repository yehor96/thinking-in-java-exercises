package com.exercises.chapters.exceptions.ex25;

public class B extends A {
    @Override
    public void method() throws Exc2 {
        throw new Exc2();
    }
}
