package com.exercises.chapters.generics.ex34;

public abstract class SelfBoundClass<T extends SelfBoundClass<T>> {

    protected abstract T abstractMethod(T value);

    public T implMethod() {
        return abstractMethod(null);
    }

}
