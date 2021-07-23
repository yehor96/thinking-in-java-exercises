package com.exercises.chapters.generics.ex3;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + fifth + ")";
    }

    @Override
    public int hashCode() {
        int result = 31 * fifth.hashCode();
        return result * super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FiveTuple)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        FiveTuple<A, B, C, D, E> other = (FiveTuple<A, B, C, D, E>) obj;

        if (other == this) {
            return true;
        }

        return this.first.equals(other.first)
                && this.second.equals(other.second)
                && this.third.equals(other.third)
                && this.fourth.equals(other.fourth)
                && this.fifth.equals(other.fifth);
    }
}
