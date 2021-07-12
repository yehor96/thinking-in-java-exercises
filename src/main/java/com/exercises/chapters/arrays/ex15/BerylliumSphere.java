package com.exercises.chapters.arrays.ex15;

import java.util.Comparator;

public class BerylliumSphere implements Comparable<BerylliumSphere> {
    private static long counter;
    private final long id = counter++;

    public static final Comparator<BerylliumSphere> REVERSED_COMPARATOR =
            (o1, o2) -> (Long.compare(o1.id, o2.id)) * -1;

    public String toString() {
        return "Sphere " + id;
    }

    @Override
    public int compareTo(BerylliumSphere o) {
        return Long.compare(this.id, o.id);
    }
}
