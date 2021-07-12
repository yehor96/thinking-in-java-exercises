package com.exercises.chapters.generics.ex15_16;

import com.exercises.chapters.generics.ex3.FiveTuple;
import com.exercises.chapters.generics.ex3.FourTuple;
import com.exercises.chapters.generics.ex3.SixTuple;
import com.exercises.chapters.generics.ex3.ThreeTuple;
import com.exercises.chapters.generics.ex3.TwoTuple;

import static com.exercises.chapters.generics.ex15_16.Tuple.tuple;

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi", 47);
    }

    static ThreeTuple<Boolean, String, Integer> g() {
        return tuple(true, "hi", 47);
    }

    static FourTuple<Character, Boolean, String, Integer> h() {
        return tuple('c', true, "hi", 47);
    }

    static FiveTuple<Character, Boolean, String, Integer, Double> k() {
        return tuple('c', true, "hi", 47, 11.1);
    }

    static SixTuple getSixTuple() {
        return tuple('c', true, "hi", 47, 11.1, 5);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        //TwoTuple<String, Integer> ttsi2 = f2();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(getSixTuple());
    }
}