package com.chapters.arrays.ex19_20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        oneDimensionalArraysEquals();
        twoDimensionalArraysEquals();
    }

    public static void twoDimensionalArraysEquals() {
        int[][] array1 = new int[][]{{3, 4, 5, 6}, {3, 4, 5, 6}};
        int[][] array2 = new int[][]{{3, 4, 5, 6}, {3, 4, 5, 6}};
        int[][] array3 = new int[][]{{3, 4, 5, 6}, {0, 0, 0, 0}};

        WithEqualsObj[][] arrayObj1 = new WithEqualsObj[][]{
                {new WithEqualsObj(5), new WithEqualsObj(5)},
                {new WithEqualsObj(5), new WithEqualsObj(5)}
        };
        WithEqualsObj[][] arrayObj2 = new WithEqualsObj[][]{
                {new WithEqualsObj(5), new WithEqualsObj(5)},
                {new WithEqualsObj(5), new WithEqualsObj(5)}
        };
        WithEqualsObj[][] arrayObj3 = new WithEqualsObj[][]{
                {new WithEqualsObj(5), new WithEqualsObj(5)},
                {new WithEqualsObj(0), new WithEqualsObj(0)}
        };

        System.out.println(Arrays.deepEquals(array1, array2));
        System.out.println(Arrays.deepEquals(array2, array3));
        System.out.println(Arrays.deepEquals(arrayObj1, arrayObj2));
        System.out.println(Arrays.deepEquals(arrayObj2, arrayObj3));
    }

    public static void oneDimensionalArraysEquals() {
        NoEqualsObj[] without1 = new NoEqualsObj[]{
                new NoEqualsObj(5),
                new NoEqualsObj(5)
        };
        NoEqualsObj[] without2 = new NoEqualsObj[]{
                new NoEqualsObj(5),
                new NoEqualsObj(5)
        };

        System.out.println("Without equals(): " + Arrays.equals(without1, without2));

        WithEqualsObj[] with1 = new WithEqualsObj[]{
                new WithEqualsObj(5),
                new WithEqualsObj(5)
        };
        WithEqualsObj[] with2 = new WithEqualsObj[]{
                new WithEqualsObj(5),
                new WithEqualsObj(5)
        };

        System.out.println("With equals(): " + Arrays.equals(with1, with2));
    }
}
