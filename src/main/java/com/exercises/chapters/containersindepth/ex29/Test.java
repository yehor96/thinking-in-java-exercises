package com.exercises.chapters.containersindepth.ex29;

public abstract class Test<C> {

    String name;

    public Test(String name) {
        this.name = name;
    }

    protected abstract int test(C container, TestParam tp);
}
