package com.exercises.chapters.generics.ex3;

public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    @Override
    public int hashCode() {
        int result = 31 * third.hashCode();
        return result * super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ThreeTuple)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        ThreeTuple<A, B, C> other = (ThreeTuple<A, B, C>) obj;

        if (other == this) {
            return true;
        }

        return this.first.equals(other.first)
                && this.second.equals(other.second)
                && this.third.equals(other.third);
    }
}
