package com.exercises.chapters.generics.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public void addAll(List<T> items) {
        storage.addAll(items);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : ("The quick brown fox jumped over the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");

        System.out.println();

        RandomList<Integer> rs2 = new RandomList<>();
        rs2.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i = 0; i < 11; i++)
            System.out.print(rs2.select() + " ");

        System.out.println();

        RandomList<Double> rs3 = new RandomList<>();
        rs3.addAll(List.of(2.4, 0.1, 1.3, 55.1, 6.1));
        for (int i = 0; i < 11; i++)
            System.out.print(rs3.select() + " ");
    }
}
