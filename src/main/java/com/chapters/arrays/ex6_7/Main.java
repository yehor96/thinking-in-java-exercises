package com.chapters.arrays.ex6_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(method2D(2, 3)));
        System.out.println(Arrays.deepToString(method3D(2, 3, 3)));
    }

    public static BerylliumSphere[][] method2D(int sizeA, int sizeB) {
        BerylliumSphere[][] array = new BerylliumSphere[sizeA][sizeB];
        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                array[i][j] = new BerylliumSphere();
            }
        }
        return array;
    }

    public static BerylliumSphere[][][] method3D(int sizeA, int sizeB, int sizeC) {
        BerylliumSphere[][][] array = new BerylliumSphere[sizeA][sizeB][sizeC];
        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                for (int k = 0; k < sizeC; k++) {
                    array[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return array;
    }

    static class BerylliumSphere {
        @Override
        public String toString() {
            return "BerylliumSphere";
        }
    }
}
