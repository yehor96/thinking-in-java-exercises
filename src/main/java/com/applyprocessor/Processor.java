package com.applyprocessor;

public interface Processor {
    String name();
    Object process(Object input);
}
