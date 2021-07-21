package com.exercises.chapters.containersindepth.ex20_21;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new SimpleHashMap<>();

        map.put("Text", "1");
        map.put("Text", "2");
        map.put("Text", "3");
        System.out.println(map.entrySet());
        System.out.println(map.get("Text"));
    }
}
