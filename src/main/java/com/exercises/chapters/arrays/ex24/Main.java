package com.exercises.chapters.arrays.ex24;

import com.exercises.chapters.arrays.ex19_20.WithEqualsObj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WithEqualsObj neededItem = new WithEqualsObj(8);

        WithEqualsObj[] array = new WithEqualsObj[]{
                new WithEqualsObj(5),
                new WithEqualsObj(6),
                new WithEqualsObj(1),
                neededItem,
                new WithEqualsObj(9),
                new WithEqualsObj(7)
        };

        System.out.println("Unsorted result: " + Arrays.binarySearch(array, neededItem));
        Arrays.sort(array);
        System.out.println("Sorted result: " + Arrays.binarySearch(array, neededItem));
        System.out.println("Not existing item result: " + Arrays.binarySearch(array, new WithEqualsObj(3)));
    }
}
