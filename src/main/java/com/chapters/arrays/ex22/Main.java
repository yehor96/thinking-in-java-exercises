package com.chapters.arrays.ex22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 9, 1, 5, 3, 7};

        System.out.println("Unsorted:");
        int result = Arrays.binarySearch(array, 5);
        System.out.println(result);
        result = Arrays.binarySearch(array, 3);
        System.out.println(result);
        result = Arrays.binarySearch(array, 7);
        System.out.println(result);

        System.out.println("Sorted:");
        Arrays.sort(array);
        result = Arrays.binarySearch(array, 5);
        System.out.println(result);
        result = Arrays.binarySearch(array, 3);
        System.out.println(result);
        result = Arrays.binarySearch(array, 7);
        System.out.println(result);
    }
}
