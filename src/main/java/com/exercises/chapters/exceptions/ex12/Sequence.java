package com.exercises.chapters.exceptions.ex12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence {
    private List<String> items;

    private static final int MAX_LENGTH = 20;

    public Sequence() {
        items = new ArrayList<>();
    }

    public void add(String x) throws TooManyElementsException {
        if (items.size() >= MAX_LENGTH) {
            throw new TooManyElementsException();
        }
        items.add(x);
    }

    public int getLength() {
        return items.size();
    }

    public Iterator<String> getForwardIterator() {
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

        public String next() {
            return items.get(--counter);
        }
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 21; i++) {
            try {
                sequence.add(Integer.toString(i));
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
