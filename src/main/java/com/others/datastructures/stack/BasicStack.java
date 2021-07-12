package com.others.datastructures.stack;

public class BasicStack<T> implements Stack<T> {

    private T[] data;
    private int pointer;

    @SuppressWarnings("unchecked")
    public BasicStack() {
        data = (T[]) new Object[1000];
        pointer = 0;
    }

    public void push(T item) {
        data[pointer++] = item;
    }

    public T pop() {
        if (pointer == 0) {
            throw new IllegalStateException("There are no items in the stack");
        }

        return data[--pointer];
    }

    public boolean contains(T item) {
        boolean found = false;

        for (int i = 0; i < pointer; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }

        return found;
    }

    public T access(T item) {
        while (pointer > 0) {
            var existingItem = pop();
            if (existingItem.equals(item)) {
                return existingItem;
            }
        }

        throw new IllegalArgumentException("There is no such item in the stack.");
    }

    public int size() {
        return pointer;
    }

}
