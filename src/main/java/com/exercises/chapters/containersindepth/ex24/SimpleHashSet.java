package com.exercises.chapters.containersindepth.ex24;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleHashSet<T> extends AbstractSet<T> {

    private static final int SIZE = 997;
    private final T[] storage;
    private int actualSize = 0;

    @SuppressWarnings("unchecked")
    public SimpleHashSet() {
        storage = (T[]) new Object[SIZE];
        actualSize = 0;
    }

    @Override
    public boolean add(T t) {
        if (contains(t)) {
            return false;
        }

        int index = Math.abs(t.hashCode()) % SIZE;
        storage[index] = t;
        actualSize++;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for (T t : storage) {
            if (t != null && t.equals(o)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].equals(o)) {
                storage[i] = null;
                actualSize--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                storage[i] = null;
            }
        }
        actualSize = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            int pointer = 0;

            @Override
            public boolean hasNext() {
                for (int i = pointer; i < storage.length; i++) {
                    if (storage[i] != null) {
                        pointer = i;
                        return true;
                    }
                }

                return false;
            }

            @Override
            public T next() {
                for (int i = pointer; i < storage.length; i++) {
                    if (storage[i] != null) {
                        pointer++;
                        return storage[i];
                    }
                }
                throw new NoSuchElementException();
            }
        };
    }

    @Override
    public int size() {
        return actualSize;
    }
}
