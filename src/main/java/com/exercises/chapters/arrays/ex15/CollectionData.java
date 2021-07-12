package com.exercises.chapters.arrays.ex15;

import com.exercises.chapters.typeinfo.ex12.cofee.Generator;

import java.util.ArrayList;

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for(int i = 0; i < quantity; i++)
            add(gen.next());
    }

    public static <T> CollectionData<T>
    list(Generator<T> gen, int quantity) {
        return new CollectionData<>(gen, quantity);
    }
}
