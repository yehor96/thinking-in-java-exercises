package com.exercises.chapters.containers.ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Generator {
    static String[] names = {"John Snow", "Dynaerys", "Arya", "Dragon", "Lannister"};

    static int current = 0;

    public static Collection next(int count, Collection collection) {
        for (int i = 0; i < count; i++) {
            collection.add(next());
        }
        return collection;
    }

    private static String next() {
        if (current == names.length) {
            current = 0;
        }
        return names[current++];

    }

    public static void main(String[] args) {
        Collection collection1 = next(11, new ArrayList());
        System.out.println(collection1);

        Collection collection2 = next(11, new LinkedList());
        System.out.println(collection2);

        Collection collection3 = next(11, new HashSet());
        System.out.println(collection3);

        Collection collection4 = next(11, new LinkedHashSet());
        System.out.println(collection4);

    }
}
