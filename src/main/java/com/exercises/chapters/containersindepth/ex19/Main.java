package com.exercises.chapters.containersindepth.ex19;

import com.exercises.chapters.containersindepth.ex20_21.SimpleHashMap;
import com.exercises.chapters.containersindepth.ex4.TextFile;

import java.util.Map;

public class Main {
    private static final String TEST_FILE_PATH = "src\\main\\resources\\Words.txt";

    public static void main(String[] args) {
        var words = TextFile.read(TEST_FILE_PATH).split("\\W+");
        Map<String, Integer> array = new SimpleHashMap<>();
        for (var word : words) {
            Integer count = array.get(word);
            if (count == null) {
                array.put(word, 1);
            } else {
                array.put(word, ++count);
            }
        }

        System.out.println(array);

    }
}
