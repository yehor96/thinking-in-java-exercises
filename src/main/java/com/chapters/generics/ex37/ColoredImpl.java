package com.chapters.generics.ex37;

public class ColoredImpl implements Colored {

    private final String color;

    public ColoredImpl(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
