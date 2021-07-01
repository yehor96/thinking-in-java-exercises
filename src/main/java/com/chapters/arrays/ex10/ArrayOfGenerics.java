package com.chapters.arrays.ex10;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {

    public static void main(String[] args) {
        List<? super Object> ls;
        List<Object> la = new ArrayList<>();
        ls = la;
        ls.add(new ArrayList<>());
        ls.add(new ArrayList<>());
        List<? super Object> objects = ls;
        objects.add(new ArrayList<Integer>());
        List<List<BerylliumSphere>> spheres =  new ArrayList<>();
        for (int i = 0; i < 10; i++)
            spheres.add(new ArrayList<>());
    }

    static class BerylliumSphere {

    }
}
