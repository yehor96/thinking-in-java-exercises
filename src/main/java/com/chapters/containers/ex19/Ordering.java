package com.chapters.containers.ex19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ordering {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Text");
        hashSet.add("Hell");
        hashSet.add("Abra");
        hashSet.add("Oppa");
        hashSet.add("Zbro");
        display(hashSet);
        System.out.println();

        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        Set<String> linkedMap = new LinkedHashSet<>(list);
        display(linkedMap);
    }

    public static void display(Set<String> set) {
        for (var each : set) {
            System.out.println(each + " --- " + each.hashCode());
        }
    }

}
