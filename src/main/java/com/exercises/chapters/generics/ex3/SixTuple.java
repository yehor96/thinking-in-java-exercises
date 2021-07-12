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
}
