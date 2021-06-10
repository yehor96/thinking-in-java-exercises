package com.chapters.generics.ex4;

import com.chapters.exceptions.ex12.TooManyElementsException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence<T> {
    private List<T> items;

    private static final int MAX_LENGTH = 20;

    public Sequence() {
        items = new ArrayList<>();
    }

    public void add(T x) throws TooManyElementsException {
        if (items.size() >= MAX_LENGTH) {
            throw new TooManyElementsException();
        }
        items.add(x);
    }

    public int getLength() {
        return items.size();
    }

    public Iterator<T> getForwardIterator() {
        return items.iterator();
    }

    public Sequence.ReversedIterator getReversedIterator() {
        return new Sequence.ReversedIterator();
    }

    private class ReversedIterator {

        int counter = items.size();

        public boolean hasNext() {
            return counter > 0;
        }

        public T next() {
            return items.get(--counter);
        }
    }


    public static void main(String[] args) {
        Sequence<String> sequence = new Sequence();
        for (int i = 0; i < 21; i++) {
            try {
                sequence.add(i + ".0");
            } catch (TooManyElementsException e) {
                System.out.println("Too many elements! Should not be more than " + sequence.getLength() +
                        ". Stopping element addition.");
                break;
            }
        }


        Iterator iterator = sequence.getForwardIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        Sequence.ReversedIterator reversedIterator = sequence.getReversedIterator();
        while (reversedIterator.hasNext()) {
            System.out.print(reversedIterator.next() + " ");
        }
    }
}
