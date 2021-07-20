package com.exercises.chapters.containersindepth.ex15;

import com.exercises.chapters.containersindepth.ex4.TextFile;

import java.util.Map;

public class Main {
    private static final String TEST_FILE_PATH = "src\\main\\resources\\Words.txt";

    public static void main(String[] args) {
        var words = TextFile.read(TEST_FILE_PATH).split("\\W+");
        Map<String, Integer> map = new SlowMap<>();
        for (var word : words) {
            Integer count = map.get(word);
            if (count == null) {
                map.put(word, 1);
            } else {
                map.put(word, ++count);
            }
        }

        System.out.println(map);

    }
}
