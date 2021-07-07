package com.chapters.containersindepth.ex3;

import com.chapters.containersindepth.ex1.Countries;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = supplyHashSet('A').get();
        System.out.println(set1);
        set1.addAll(supplyHashSet('A').get());
        System.out.println(set1);
        set1.addAll(supplyHashSet('A').get());
        System.out.println(set1);

        Set<String> set2 = supplyLinkedHashSet('B').get();
        System.out.println(set2);
        set2.addAll(supplyLinkedHashSet('B').get());
        System.out.println(set2);
        set2.addAll(supplyLinkedHashSet('B').get());
        System.out.println(set2);

        Set<String> set3 = supplyTreeSet('C').get();
        System.out.println(set3);
        set3.addAll(supplyTreeSet('C').get());
        System.out.println(set3);
        set3.addAll(supplyTreeSet('C').get());
        System.out.println(set3);
    }

    static Supplier<Set<String>> supplyHashSet(Character letter) {
        return () ->
                Countries.names().stream()
                        .filter(c -> c.startsWith(letter.toString()))
                        .collect(toSet());
    }

    static Supplier<Set<String>> supplyLinkedHashSet(Character letter) {
        return () ->
                Countries.names().stream()
                        .filter(c -> c.startsWith(letter.toString()))
                        .collect(toCollection(LinkedHashSet::new));
    }

    static Supplier<Set<String>> supplyTreeSet(Character letter) {
        return () ->
                Countries.names().stream()
                        .filter(c -> c.startsWith(letter.toString()))
                        .collect(toCollection(TreeSet::new));
    }
}
