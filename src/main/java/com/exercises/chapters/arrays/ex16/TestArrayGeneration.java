package com.exercises.chapters.arrays.ex16;

import com.exercises.chapters.arrays.ex12_13.CountingGenerator;
import com.exercises.chapters.arrays.ex15.Generated;

import java.util.Arrays;

public class TestArrayGeneration {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerator.Boolean(), size));
        System.out.println("a1 = " + Arrays.toString(a1));


        var array = Generated.array(Integer.class, new SkipGenerator.Integer(3), 10);
        int[] a2 = ConvertTo.primitive(array);
        System.out.println("a2 = " + Arrays.toString(a2));
    }
}
