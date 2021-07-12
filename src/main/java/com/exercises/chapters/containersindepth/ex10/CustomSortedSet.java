package com.exercises.chapters.containersindepth.ex10;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

public class CustomSortedSet<T> {

    private final LinkedList<T> storage = new LinkedList<>();
    private final Comparator<T> comparator;

    public CustomSortedSet(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public void add(T item) {
        if (!storage.contains(item)) {
            for (int i = 0; i < storage.size(); i++) {
                if (comparator.compare(item, storage.get(i)) < 0) {
                    storage.add(i, item);
                    return;
                }
            }
            storage.add(item);
        }
    }

    public void addAll(Collection<T> collection) {
        for (var item : collection) {
            add(item);
        }
    }

    public T getFirst() {
        return storage.getFirst();
    }

    public T getLast() {
        return storage.getLast();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
