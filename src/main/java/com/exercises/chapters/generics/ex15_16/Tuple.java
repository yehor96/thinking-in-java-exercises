package com.exercises.chapters.generics.ex15_16;

import com.exercises.chapters.generics.ex3.FiveTuple;
import com.exercises.chapters.generics.ex3.FourTuple;
import com.exercises.chapters.generics.ex3.SixTuple;
import com.exercises.chapters.generics.ex3.ThreeTuple;
import com.exercises.chapters.generics.ex3.TwoTuple;

public class Tuple {
    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<>(a, b);
    }

    public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeTuple<>(a, b, c);
    }

    public static <A, B, C, D> FourTuple<A, B, C, D> tuple(A a, B b, C c, D d) {
        return new FourTuple<>(a, b, c, d);
    }

    public static <A, B, C, D, E> FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e) {
        return new FiveTuple<>(a, b, c, d, e);
    }

    public static <A, B, C, D, E, G> SixTuple<A, B, C, D, E, G> tuple(A a, B b, C c, D d, E e, G g) {
        return new SixTuple<>(a, b, c, d, e, g);
    }
}
