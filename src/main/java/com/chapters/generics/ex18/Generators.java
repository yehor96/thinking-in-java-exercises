package com.chapters.generics.ex18;

import com.chapters.typeinfo.ex12.cofee.Generator;

import java.util.Collection;

public class Generators {

    public static <T> void fill(Collection<T> collection, Generator<T> generator, int size) {
        for (int i = 0; i < size; i++) {
            collection.add(generator.next());
        }
    }

}
