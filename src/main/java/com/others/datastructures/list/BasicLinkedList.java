package com.others.datastructures.list;

public class BasicLinkedList<T> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    private class Node {
        private T item;
        private Node nextNode;

        public Node(T item) {
            this.item = item;
            nextNode = null;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node node) {
            nextNode = node;
        }

        public T getNodeItem() {
            return item;
        }
    }

    public int size() {
        return nodeCount;
    }

    public void add(T item) {
        if (first == null) {
            first = new Node(item);
            last = first;
        } else {
            Node newNode = new Node(item);
            last.setNextNode(newNode);
            last = newNode;
        }
        nodeCount++;
    }

    public T remove() {
        if (first == null) {
            throw new IllegalStateException("List is empty");
        }

        T firstItem = first.getNodeItem();
        first = first.getNextNode();
        nodeCount--;
        return firstItem;
    }

    public void insert(T item, int position) {
        if (size() < position) {
            throw new IllegalArgumentException("Position is bigger than list length");
        }

        Node currentNode = first;
        for (int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }
        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    public T removeAt(int position) {
        if (first == null) {
            throw new IllegalStateException("List is empty");
        }

        Node currentNode = first;
        Node previousNode = first;
        for (int i = 1; i < position && currentNode != null; i++) {
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        T itemToReturn = currentNode.getNodeItem();
        previousNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return itemToReturn;
    }

    public int find(T item) {
        if (size() == 0) {
            throw new IllegalStateException("List is empty");
        }

        Node currentNode = first;
        for (int i = 1; i < size() && currentNode != null; i++) {
            if (currentNode.getNodeItem().equals(item)) {
                return i;
            }
            currentNode = currentNode.getNextNode();
        }
        return -1;
    }

    public T get(int position) {
        if (size() == 0) {
            throw new IllegalStateException("List is empty");
        }

        Node currentNode = first;
        for (int i = 1; i < size() && currentNode != null; i++) {
            if (position == i) {
                return currentNode.getNodeItem();
            }
            currentNode = currentNode.getNextNode();
        }

        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = first;
        for (int i = 1; i < nodeCount; i++) {
            sb.append(currentNode.getNodeItem());
            currentNode = currentNode.getNextNode();
            if(currentNode != null) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
