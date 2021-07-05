package com.chapters.arrays.ex19_20;

public class NoEqualsObj implements Comparable<NoEqualsObj> {
    protected int field;

    public NoEqualsObj(int value) {
        field = value;
    }

    @Override
    public int compareTo(NoEqualsObj o) {
        return Long.compare(this.field, o.field);
    }
}
