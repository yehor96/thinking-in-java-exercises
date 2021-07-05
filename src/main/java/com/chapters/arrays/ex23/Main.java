package com.chapters.arrays.ex23;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 9, 1, 5, 3, 7};

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
