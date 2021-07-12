package com.exercises.random.applyprocessor;

public interface Processor {
    String name();
    Object process(Object input);
}
