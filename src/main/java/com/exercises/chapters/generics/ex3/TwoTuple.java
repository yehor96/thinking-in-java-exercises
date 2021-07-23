package com.exercises.chapters.generics.ex3;

public class TwoTuple<A, B> {

    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    @Override
    public int hashCode() {
        int result = 31 * first.hashCode();
        result = 31 * result * second.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TwoTuple)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        TwoTuple<A, B> other = (TwoTuple<A, B>) obj;

        if (other == this) {
            return true;
        }

        return this.first.equals(other.first)
                && this.second.equals(other.second);
    }
}
