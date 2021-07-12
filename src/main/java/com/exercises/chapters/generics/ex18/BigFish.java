package com.exercises.chapters.generics.ex18;

import com.exercises.chapters.typeinfo.ex12.cofee.Generator;

public class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {
    }

    public String toString() {
        return "BigFish " + id;
    }

    public static final Generator<BigFish> generator = BigFish::new;
}
