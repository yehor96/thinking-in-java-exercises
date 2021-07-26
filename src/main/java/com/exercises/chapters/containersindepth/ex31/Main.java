package com.exercises.chapters.containersindepth.ex31;

public class Main {
    public static void main(String[] args) {

        StringContainer sc = new StringContainer();
        sc.add("Text1");
        sc.add("Text2");
        sc.add("Text3");
        sc.add("Text4");
        sc.add("Text5");

        System.out.println(sc.contains("Text1"));
        System.out.println(sc.get(3));
        System.out.println(sc.remove(2));
        System.out.println(sc.contains("Text3"));

        for (var each : sc) {
            System.out.println(each);
        }
    }
}
