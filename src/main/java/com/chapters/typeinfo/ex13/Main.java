package com.chapters.typeinfo.ex13;

import com.chapters.typeinfo.ex12.TypeCounter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        for (Part aPart : makeParts(20)) {
            System.out.print(aPart.getClass().getSimpleName() + " ");
            counter.count(aPart);
        }
        System.out.println();
        System.out.print(counter);
    }

    public static List<Part> makeParts(int size) {
        List<Part> parts = new ArrayList<>();
        for (int i = 0; i < size; i++)
            parts.add(Part.createRandom());
        return parts;
    }
}
