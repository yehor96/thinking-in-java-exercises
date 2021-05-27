package com.chapters.containers.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mainList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> secondaryList = new ArrayList<>(mainList.size());

        var it = mainList.listIterator(mainList.size());

        while (it.hasPrevious()) {
            secondaryList.add(it.previous());
        }

        mainList.forEach(System.out::println);
        System.out.println();
        secondaryList.forEach(System.out::println);

    }
}
