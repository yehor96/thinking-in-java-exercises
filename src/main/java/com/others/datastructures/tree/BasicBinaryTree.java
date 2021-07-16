package com.others.datastructures.tree;

public class BasicBinaryTree<T extends Comparable<T>> {

    private Node root;
    private int size;

    public BasicBinaryTree() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T item) {
        Node node = new Node(item);

        if (root == null) {
            root = node;
            size++;
        } else {
            insert(root, node);
        }
    }

    public boolean contains(T item) {
        return getNode(item) != null;
    }

    public boolean delete(T item) {
        boolean deleted = false;

        if (root == null) {
            return deleted;
        }

        Node currentNode = getNode(item);
        if (currentNode != null) {
            if (currentNode.getLeft() == null && currentNode.getRight() == null) {
                unlink(currentNode, null);
                deleted = true;
            } else if (currentNode.getLeft() == null && currentNode.getRight() != null) {
                unlink(currentNode, currentNode.getRight());
                deleted = true;
            } else if (currentNode.getLeft() != null && currentNode.getRight() == null) {
                unlink(currentNode, currentNode.getLeft());
                deleted = true;
            } else {
                Node child = currentNode.getLeft();
                while (child.getRight() != null && child.getLeft() != null) {
                    child = child.getRight();
                }

                child.getParent().setRight(null);
                child.setLeft(currentNode.getLeft());
                child.setRight(currentNode.getRight());
                unlink(currentNode, child);
                deleted = true;
            }
        }

        if (deleted) {
            size--;
        }

        return deleted;
    }

    private Node getNode(T item) {
        Node currentNode = root;

        while (currentNode != null) {
            int value = item.compareTo(currentNode.getItem());

            if (value == 0) {
                return currentNode;
            } else if (value < 0) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }

        return null;
    }

    private void unlink(Node currentNode, Node newNode) {
        if (currentNode == root) {
            newNode.setLeft(currentNode.getLeft());
            newNode.setRight(currentNode.getRight());
            root = newNode;
        } else if (currentNode.getParent().getRight() == currentNode) {
            currentNode.getParent().setRight(newNode);
        } else {
            currentNode.getParent().setLeft(newNode);
        }
    }

    private void insert(Node parent, Node child) {
        if (child.getItem().compareTo(parent.getItem()) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                size++;
            } else {
                insert(parent.getLeft(), child);
            }
        } else if (child.getItem().compareTo(parent.getItem()) > 0) {
            if (parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                size++;
            } else {
                insert(parent.getRight(), child);
            }
        } else {
            // do not add element if it already exists in the tree
        }
    }

    private class Node {
        private Node left, right, parent;
        private T item;

        public Node(T item) {
            this.item = item;
            left = null;
            right = null;
            parent = null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }
}
