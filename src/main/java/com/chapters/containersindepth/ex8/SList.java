package com.chapters.containersindepth.ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SList<T> {

    private final List<Node> list = new ArrayList<>();

    private class Node {
        T item;
        int position;

        public Node(T item) {
            this.item = item;
            this.position = list.indexOf(this);
        }

        public T get() {
            return item;
        }

        public T getNext() {
            return list.get(position + 1).get();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(item, node.item);
        }
    }

    public SListIterator<T> iterator() {
        return new Iterator();
    }

    private class Iterator implements SListIterator<T> {
        private int counter = 0;

        public boolean hasNext() {
            return counter < list.size();
        }

        public T next() {
            return list.get(counter++).get();
        }

        public void add(T item) {
            list.add(new Node(item));
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
