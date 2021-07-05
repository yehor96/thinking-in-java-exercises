package com.chapters.arrays.ex21;

import com.chapters.arrays.ex12_13.CountingGenerator;
import com.chapters.arrays.ex15.BerylliumSphere;
import com.chapters.arrays.ex15.Generated;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = Generated.array(
                new BerylliumSphere[10],
                new CountingGenerator.BerylliumSphere());

        System.out.println(Arrays.toString(spheres));
        Arrays.sort(spheres);
        System.out.println(Arrays.toString(spheres));
        Arrays.sort(spheres, BerylliumSphere.REVERSED_COMPARATOR);
        System.out.println(Arrays.toString(spheres));
    }
}
