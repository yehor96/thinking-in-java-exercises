package com.exercises.chapters.containersindepth.ex24;

public class Main {
    public static void main(String[] args) {
        SimpleHashSet<String> set = new SimpleHashSet<>();

        set.add("Text1");
        set.add("Text2");
        set.add("Text3");
        set.add("Text4");
        set.add("Text5");

        System.out.println(set.contains("Text3"));
        set.remove("Text3");
        System.out.println(set.contains("Text3"));

        System.out.println(set.size());
        set.remove("Text5");
        System.out.println(set.size());

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        set.add("Text1");
        set.add("Text1");
        System.out.println(set.size());

        set.clear();
        System.out.println(set.contains("Text1"));
        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }
}
