package com.chapters.generics.ex22;

public class Example {

    private final int value;

    public Example() {
        this(0);
    }

    public Example(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName() + " value:" + value;
    }
}
