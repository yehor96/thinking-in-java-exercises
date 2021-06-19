package com.chapters.generics.ex28.storage;

public class Generics1<T> {

    private Storage<T> storage;

    public Generics1(Storage<T> storage) {
        this.storage = storage;
    }

    public void set(T value) {
        System.out.println("Setting " + value);
        storage.value = value;
    }

}
