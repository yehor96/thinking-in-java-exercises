package com.chapters.innerclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence {
    private List<String> items;

    public Sequence() {
        items = new ArrayList<>();
    }

    public void add(String x) {
        items.add(x);
    }

    public Iterator<String> getForwardIterator() {
        return items.iterator();
    }

    public ReversedIterator getReversedIterator() {
        return new ReversedIterator();
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
        for (int i = 0; i < 20; i++)
            sequence.add(Integer.toString(i));

        Iterator iterator = sequence.getForwardIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        ReversedIterator reversedIterator = sequence.getReversedIterator();
        while (reversedIterator.hasNext()) {
            System.out.print(reversedIterator.next() + " ");
        }
    }
}
