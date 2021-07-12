package com.exercises.chapters.generics.ex2;

public class Holders<T> {

    private T item1, item2, item3;

    public Holders(T t1, T t2, T t3) {
        item1 = t1;
        item2 = t2;
        item3 = t3;
    }

    public T getItem(int index) {
        switch (index) {
            case 0:
                return item1;
            case 1:
                return item2;
            case 2:
                return item3;
            default:
                throw new IllegalArgumentException("Only 0 to 2 indexes are available");
        }
    }

    public void setItem(T item, int index) {
        switch (index) {
            case 0:
                item1 = item;
                break;
            case 1:
                item2 = item;
                break;
            case 2:
                item3 = item;
                break;
            default:
                throw new IllegalArgumentException("Only 0 to 2 indexes are available");
        }
    }

    @Override
    public String toString() {
        return "Holders{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                '}';
    }
}
