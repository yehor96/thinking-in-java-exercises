package com.exercises.chapters.generics.ex32_33;

import java.util.ArrayList;
import java.util.List;

class FixedSizeStack<T> {
    private int index = 0;
    private int size;
    private List<Object> storage;

    public FixedSizeStack(int size) {
        this.size = size;
        storage = new ArrayList<>();
    }

    public void push(T item) {
        if (size < ++index) {
            throw new RuntimeException("FixedSizeStack storage has been overflowed.");
        }

        storage.add(item);
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (0 > --index) {
            throw new RuntimeException("FixedSizeStack storage has been underflowed.");
        }

        return (T) storage.get(index);
    }
}

public class GenericCast {
    public static final int SIZE = 1;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<>(SIZE);
        for (String s : "A B C D E F G H I J".split(" "))
            strings.push(s);
        for (int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
}
