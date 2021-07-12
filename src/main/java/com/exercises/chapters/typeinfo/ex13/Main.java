package com.exercises.chapters.typeinfo.ex13;

import com.exercises.chapters.typeinfo.ex12.TypeCounter;
import com.exercises.chapters.typeinfo.ex24.IPart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        for (IPart aPart : makeParts(20)) {
            System.out.print(aPart.getClass().getSimpleName() + " ");
            counter.count(aPart);
        }
        System.out.println();
        System.out.print(counter);
    }

    public static List<IPart> makeParts(int size) {
        List<IPart> parts = new ArrayList<>();
        for (int i = 0; i < size; i++)
            parts.add(Part.createRandom());
        return parts;
    }
}
