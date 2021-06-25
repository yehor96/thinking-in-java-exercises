package com.chapters.typeinfo.ex11;

public class Pet {
    protected String name;

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        super();
    }

    public void speak() {
        System.out.println(getClass().getSimpleName() + " speaks loudly!");
    }
}

