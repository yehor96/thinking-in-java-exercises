package com.exercises.chapters.io.ex27;

import java.io.Serializable;

public class Green implements Serializable {

    public int num;

    @Override
    public String toString() {
        return "Green{" +
                "num=" + num +
                '}';
    }
}
