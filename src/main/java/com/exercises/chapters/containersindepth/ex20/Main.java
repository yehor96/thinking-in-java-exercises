package com.exercises.chapters.containersindepth.ex20;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new SimpleHashMap<>();

        map.put("Text", "1");
        map.put("Text", "2");
        System.out.println(map.entrySet());
    }
}
