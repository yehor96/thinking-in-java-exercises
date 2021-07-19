package com.exercises.chapters.containersindepth.ex12_13;

import com.exercises.chapters.containersindepth.ex4.TextFile;

public class Main {
    private static final String TEST_FILE_PATH = "src\\main\\resources\\Words.txt";

    public static void main(String[] args) {
        var words = TextFile.read(TEST_FILE_PATH).split("\\W+");
        AssociativeArray<String, Integer> array = new AssociativeArray<>(words.length);
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
