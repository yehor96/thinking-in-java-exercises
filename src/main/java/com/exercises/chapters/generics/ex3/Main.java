package com.exercises.chapters.generics.ex3;

public class Main {
    public static void main(String[] args) {
        SixTuple<String, String, String, String, String, Integer> tuple =
                new SixTuple<>("First", "Second", "Third", "Fourth", "Five", 6);

        System.out.println(tuple);

    }
}
