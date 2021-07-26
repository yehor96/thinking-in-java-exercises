package com.exercises.chapters.containersindepth.ex31;

import java.util.AbstractList;
import java.util.Iterator;

public class StringContainer extends AbstractList<String> implements Iterable<String> {

    private String[] array;
    private int head;

    public StringContainer() {
        this(20);
    }

    public StringContainer(int size) {
        array = new String[size];
        head = 0;
    }

    @Override
    public boolean add(String item) {
        if (head == array.length) {
            resize();
        }
        array[head++] = item;
        return true;
    }

    @Override
    public String get(int index) {
        if (index <= head) {
            return array[index];
        } else {
            return null;
        }
    }

    public boolean contains(String item) {
        for (int i = 0; i < head; i++) {
            if (array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String remove(int index) {
        if (index >= head) {
            return null;
        }

        String item = array[index];
        for (int i = index; i < head; i++) {
            array[i] = array[i + 1];
        }
        head--;
        return item;
    }

    private void resize() {
        String[] newArray = new String[array.length * array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer < head;
            }

            @Override
            public String next() {
                return array[pointer++];
            }
        };
    }

    @Override
    public int size() {
        return head;
    }
}
