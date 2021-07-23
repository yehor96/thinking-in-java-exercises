package com.exercises.chapters.generics.ex3;

public class SixTuple<A, B, C, D, E, G> extends FiveTuple<A, B, C, D, E> {

    public final G sixth;

    public SixTuple(A a, B b, C c, D d, E e, G g) {
        super(a, b, c, d, e);
        sixth = g;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + fifth + ", " + sixth + ")";
    }

    @Override
    public int hashCode() {
        int result = 31 * sixth.hashCode();
        return result * super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SixTuple)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        SixTuple<A, B, C, D, E, G> other = (SixTuple<A, B, C, D, E, G>) obj;

        if (other == this) {
            return true;
        }

        return this.first.equals(other.first)
                && this.second.equals(other.second)
                && this.third.equals(other.third)
                && this.fourth.equals(other.fourth)
                && this.fifth.equals(other.fifth)
                && this.sixth.equals(other.sixth);
    }
}
