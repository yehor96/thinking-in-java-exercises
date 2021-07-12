package com.exercises.chapters.generics.ex22;

public class Example {

    private final Object value;

    public Example(String value) {
        this.value = value;
    }

    public Example(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName() + " value:" + value;
    }
}
