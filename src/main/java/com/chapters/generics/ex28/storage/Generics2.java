package com.chapters.generics.ex28.storage;

public class Generics2<T> {

    private Storage<T> storage;

    public Generics2(Storage<T> storage) {
        this.storage = storage;
    }

    public T get() {
        System.out.println("Getting " + storage.value);
        return storage.value;
    }

}
