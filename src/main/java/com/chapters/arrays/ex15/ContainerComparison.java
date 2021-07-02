package com.chapters.arrays.ex15;

import com.chapters.arrays.ex12_13.CountingGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];

        Generated.array(spheres, new CountingGenerator.BerylliumSphere());

        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        List<BerylliumSphere> sphereList = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            sphereList.add(new BerylliumSphere());
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));
    }
}