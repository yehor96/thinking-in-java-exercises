package com.others.datastructures.queue;

public class BasicQueue<T> implements Queue<T> {
    private T[] data;
    private int frontPointer, endPointer;

    public BasicQueue() {
        this(1000);
    }

    @SuppressWarnings("unchecked")
    public BasicQueue(int size) {
        data = (T[]) new Object[size];
        frontPointer = -1;
        endPointer = -1;
    }

    public int size() {
        if (frontPointer == -1 && endPointer == -1)
            return 0;

        return endPointer - frontPointer + 1;
    }

    public void enQueue(T item) {
        if ((endPointer + 1) % data.length == frontPointer) {
            throw new IllegalStateException("Queue is full");
        }

        if (size() == 0) {
            frontPointer++;
        }
        data[++endPointer] = item;
    }

    public T deQueue() {
        T item;

        if (size() == 0) {
            throw new IllegalStateException("Queue is empty");
        } else if (frontPointer == endPointer) {
            item = data[frontPointer];
            frontPointer = -1;
            endPointer = -1;
        } else {
            item = data[frontPointer++];
        }

        return item;
    }

    public boolean contains(T item) {
        boolean found = false;
        if (size() == 0) {
            return found;
        }

        for (int i = frontPointer; i < endPointer; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }

        return found;
    }

    public T access(int index) {
        if (size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        int trueIndex = index + frontPointer;
        if (trueIndex > endPointer) {
            throw new IllegalStateException("Index is bigger than actual queue size");
        }

        return data[trueIndex];
    }
}
