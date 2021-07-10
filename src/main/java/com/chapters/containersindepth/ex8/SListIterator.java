package com.chapters.containersindepth.ex8;

public interface SListIterator<T> {

    boolean hasNext();
    T next();
    void add(T item);

}
