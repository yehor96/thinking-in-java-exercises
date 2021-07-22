package com.exercises.chapters.containersindepth.ex23;

import com.exercises.chapters.containersindepth.ex1.Countries;

public class Main {
    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.get("ERITREA"));
        System.out.println(m.containsKey("ERITREA"));
        m.remove("ERITREA");
        System.out.println(m.containsKey("ERITREA"));
        System.out.println(m.size());
        System.out.println(m.entrySet());
        System.out.println(m.isEmpty());
        m.clear();
        System.out.println(m.isEmpty());
        System.out.println(m.size());
    }
}
