package com.exercises.chapters.containers.ex32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class NonCollectionSequence implements Iterable<Pet> {
    public NonCollectionSequence(int size) {
        pets = new Pet[size];
        for (int i = 0; i < size; i++) {
            pets[i] = new Pet("Name" + (i + 1));
        }
    }

    private Pet[] pets;

    public Iterator<Pet> iterator() {
        return new Iterator<>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }
        };
    }

    public Iterable<Pet> reversed() {
        return () -> new Iterator<>() {
            int current = pets.length - 1;

            @Override
            public boolean hasNext() {
                return current > -1;
            }

            @Override
            public Pet next() {
                return pets[current--];
            }
        };
    }

    public Iterable<Pet> randomized() {
        return () -> {
            List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
            Collections.shuffle(shuffled, new Random(47));
            return shuffled.iterator();
        };
    }
}
