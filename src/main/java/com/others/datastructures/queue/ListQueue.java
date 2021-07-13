package com.others.datastructures.queue;

import java.util.ArrayList;
import java.util.List;

public class ListQueue<T> implements Queue<T> {

    private List<T> data;
    private int frontPointer, endPointer;

    public ListQueue() {
        data = new ArrayList<>();
        frontPointer = -1;
        endPointer = -1;
    }

    @Override
    public int size() {
        if (frontPointer == -1 && endPointer == -1)
            return 0;

        return endPointer - frontPointer + 1;
    }

    @Override
    public void enQueue(T item) {
        if (size() == 0) {
            frontPointer++;
        }

        data.add(item);
        endPointer++;
    }

    @Override
    public T deQueue() {
        if (size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        T element;

        if (frontPointer == endPointer) {
            element = data.get(frontPointer);
            frontPointer = -1;
            endPointer = -1;
        } else {
            element = data.get(frontPointer++);
        }

        return element;
    }

    @Override
    public boolean contains(T item) {
        boolean found = false;
        if (size() == 0) {
            return found;
        }

        for (int i = frontPointer; i < endPointer; i++) {
            if (data.get(i).equals(item)) {
                found = true;
                break;
            }
        }

        return found;
    }

    @Override
    public T access(int index) {
        if (size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        int trueIndex = index + frontPointer;
        if (trueIndex > endPointer) {
            throw new IllegalStateException("Index is bigger than actual queue size");
        }

        return data.get(trueIndex);
    }
}
