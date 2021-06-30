package com.chapters.arrays.ex3_4;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printArray(getArray2D(2, 3, 1.2, 3.4));
        System.out.println("****");
        printArray(getArray2D(3, 3, 2.1, 2.5));
        System.out.println("****");
        printArray(getArray2D(4, 4, 5.1, 3.4));
        System.out.println("****");

        printArray(getArray3D(2, 3, 4, 1.2, 3.4));
        System.out.println("****");
        printArray(getArray3D(3, 3, 2, 2.1, 2.5));
        System.out.println("****");
        printArray(getArray3D(4, 4, 2, 5.1, 3.4));
    }

    public static Double[][] getArray2D(int sizeA, int sizeB, double startFillValue, double endFillValue) {
        Double[][] array = new Double[sizeA][sizeB];

        if (startFillValue > endFillValue) {
            var temp = startFillValue;
            startFillValue = endFillValue;
            endFillValue = temp;
        }
        double valueToFill = startFillValue;

        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                if (valueToFill >= endFillValue) {
                    valueToFill = startFillValue;
                }
                array[i][j] = valueToFill;
                valueToFill = incrementBy(valueToFill, 0.1);
            }
        }
        return array;
    }

    public static Double[][][] getArray3D(int sizeA, int sizeB, int sizeC,
                                          double startFillValue, double endFillValue) {
        Double[][][] array = new Double[sizeA][sizeB][sizeC];

        if (startFillValue > endFillValue) {
            var temp = startFillValue;
            startFillValue = endFillValue;
            endFillValue = temp;
        }
        double valueToFill = startFillValue;

        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                for (int k = 0; k < sizeC; k++) {
                    if (valueToFill >= endFillValue) {
                        valueToFill = startFillValue;
                    }
                    array[i][j][k] = valueToFill;
                    valueToFill = incrementBy(valueToFill, 0.1);
                }
            }
        }
        return array;
    }

    public static double incrementBy(double currentValue, double by) {
        DecimalFormat df = new DecimalFormat("#.#");
        return Double.parseDouble(df.format(currentValue + by));
    }

    public static void printArray(Double[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static void printArray(Double[][][] array) {
        System.out.println(Arrays.deepToString(array));
    }
}
