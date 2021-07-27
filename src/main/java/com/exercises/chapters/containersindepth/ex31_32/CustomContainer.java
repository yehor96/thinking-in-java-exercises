package com.exercises.chapters.containersindepth.ex31_32;

import java.util.AbstractList;
import java.util.Iterator;

public class CustomContainer<T> extends AbstractList<T> implements Iterable<T> {

    private T[] array;
    private int head;

    public CustomContainer() {
        this(20);
    }

    @SuppressWarnings("unchecked")
    public CustomContainer(int size) {
        array = (T[]) new Object[size];
        head = 0;
    }

    @Override
    public boolean add(T item) {
        if (head == array.length) {
            resize();
        }
        array[head++] = item;
        return true;
    }

    @Override
    public T get(int index) {
        if (index <= head) {
            return array[index];
        } else {
            return null;
        }
    }

    public boolean contains(Object item) {
        for (int i = 0; i < head; i++) {
            if (array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index >= head) {
            return null;
        }

        T item = array[index];
        for (int i = index; i < head; i++) {
            array[i] = array[i + 1];
        }
        head--;
        return item;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[])new Object[array.length * array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            private int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer < head;
            }

            @Override
            public T next() {
                return array[pointer++];
            }
        };
    }

    @Override
    public int size() {
        return head;
    }
}
