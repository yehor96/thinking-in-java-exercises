package com.chapters.containersindepth.ex9;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        var generator = new RandomGenerator.String();

        for (int i = 0; i < 10; i++) {
            set.add(generator.next().toLowerCase());
        }

        System.out.println(set);
    }
}
