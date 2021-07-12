package com.exercises.chapters.containersindepth.ex10;

import com.exercises.chapters.containersindepth.ex9.RandomGenerator;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<String> naturalOrder = Comparator.naturalOrder();
        CustomSortedSet<String> set = new CustomSortedSet<>(naturalOrder);
        var rr = new RandomGenerator.String();
        for (int i = 0; i < 15; i++) {
            set.add(rr.next().toLowerCase());
        }

        System.out.println(set);
    }
}
