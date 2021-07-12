package com.exercises.chapters.containersindepth.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Countries.names(6));
        List<String> linkedList = new LinkedList<>(Countries.names(6));

        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println(arrayList);
        System.out.println(linkedList);

        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);
        System.out.println(arrayList);
        System.out.println(linkedList);

        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);
        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}
