package com.chapters.containers.ex32;

public class Pet {

    private static int counter = 1;
    private int id;

    public Pet(String name) {
        this.name = name;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public String name;

    @Override
    public String toString() {
        return name;
    }
}
