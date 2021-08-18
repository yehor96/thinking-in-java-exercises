package com.exercises.chapters.io.ex17;

import com.exercises.chapters.containersindepth.ex4.TextFile;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "src\\main\\resources\\Lines.txt";
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : TextFile.read(fileName).toLowerCase().toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                continue;
            }

            Integer counter = map.get(c);
            if (counter == null) {
                map.put(c, 1);
            } else {
                map.put(c, ++counter);
            }
        }

        System.out.println(map);
    }
}
