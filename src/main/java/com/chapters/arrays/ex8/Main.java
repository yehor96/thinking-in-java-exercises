package com.chapters.arrays.ex8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[3];
        Object[] objects = new Object[3];

        strings[0] = "text";

        // not allowed:
        // strings[1] = 1;
        // strings[2] = new Object();

        objects[0] = new Object();
        objects[1] = "text";
        objects[2] = 1;

        System.out.println(Arrays.toString(objects));
    }
}
