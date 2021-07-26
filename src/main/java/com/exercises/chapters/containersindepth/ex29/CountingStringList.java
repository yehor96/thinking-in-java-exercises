package com.exercises.chapters.containersindepth.ex29;

import com.exercises.chapters.arrays.ex12_13.CountingGenerator;

import java.util.AbstractList;

public class CountingStringList extends AbstractList<String> {
    private int size;
    private final CountingGenerator.String generator = new CountingGenerator.String();

    public CountingStringList(int size) {
        this.size = size < 0 ? 0 : size;
    }

    public String get(int index) {
        return generator.next() + index;
    }

    public int size() {
        return size;
    }
}
