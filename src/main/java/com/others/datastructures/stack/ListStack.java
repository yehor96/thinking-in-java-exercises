package com.others.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<T> implements Stack<T> {

    private List<T> data;
    private int pointer;

    public ListStack() {
        data = new ArrayList<>();
        pointer = 0;
    }


    @Override
    public void push(T item) {
        data.add(item);
        pointer++;
    }

    @Override
    public T pop() {
        if (pointer == 0) {
            throw new IllegalStateException("There are no items in the stack");
        }
        return data.get(--pointer);
    }

    @Override
    public boolean contains(T item) {
        return data.contains(item);
    }

    @Override
    public T access(T item) {
        return data.stream()
                .filter(i -> i.equals(item))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such item in the stack"));
    }

    @Override
    public int size() {
        return pointer;
    }
}
