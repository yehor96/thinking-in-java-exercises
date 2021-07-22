package com.exercises.chapters.containersindepth.ex22;

import com.exercises.chapters.containersindepth.ex1.Countries;

public class Main {
    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());

        m.clear();
        System.out.println(m.entrySet());

        m.put("GB", "London");
        m.put("Ukraine", "Kyiv");

        System.out.println(m.remove("GB"));
        System.out.println(m.entrySet());
    }
}
