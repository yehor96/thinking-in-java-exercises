package com.exercises.chapters.generics.ex3;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D fourth;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        fourth = d;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ")";
    }

    @Override
    public int hashCode() {
        int result = 31 * fourth.hashCode();
        return result * super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FourTuple)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        FourTuple<A, B, C, D> other = (FourTuple<A, B, C, D>) obj;

        if (other == this) {
            return true;
        }

        return this.first.equals(other.first)
                && this.second.equals(other.second)
                && this.third.equals(other.third)
                && this.fourth.equals(other.fourth);
    }
}
