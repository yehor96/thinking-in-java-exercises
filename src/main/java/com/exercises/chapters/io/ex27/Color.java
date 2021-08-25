package com.exercises.chapters.io.ex27;

import java.io.Serializable;

public class Color implements Serializable {
    public final Green green;

    public Color(Green green) {
        this.green = green;
    }

    @Override
    public String toString() {
        return "Color{" +
                "green=" + green +
                '}';
    }
}
