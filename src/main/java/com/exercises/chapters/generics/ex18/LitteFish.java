package com.exercises.chapters.generics.ex18;

import com.exercises.chapters.typeinfo.ex12.cofee.Generator;

public class LitteFish {
    private static long counter = 1;
    private final long id = counter++;

    private LitteFish() {
    }

    public String toString() {
        return "LitteFish " + id;
    }

    public static final Generator<LitteFish> generator = LitteFish::new;
}
