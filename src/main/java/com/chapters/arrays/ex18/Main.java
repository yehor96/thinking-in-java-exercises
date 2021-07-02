package com.chapters.arrays.ex18;

import com.chapters.arrays.ex12_13.CountingGenerator;
import com.chapters.arrays.ex15.BerylliumSphere;
import com.chapters.arrays.ex15.Generated;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BerylliumSphere[] initialSpheres = Generated.array(
                new BerylliumSphere[10],
                new CountingGenerator.BerylliumSphere());

        System.out.println("Initial: " + Arrays.toString(initialSpheres));

        BerylliumSphere[] newSpheres = new BerylliumSphere[9];
        System.arraycopy(initialSpheres, 1, newSpheres, 0, 9);
        System.out.println("New: " + Arrays.toString(newSpheres));
    }
}
