package com.exercises.chapters.arrays.ex11;

public class Main {

    public static void main(String[] args) {
        int[] primInts = new int[3];
        primInts[0] = new Integer(4);
        Integer[] wrapInts = new Integer[3];
        wrapInts[0] = 5;

        // not able:
        // primInts = wrapInts;
        // wrapInts = primInts;
    }

}
