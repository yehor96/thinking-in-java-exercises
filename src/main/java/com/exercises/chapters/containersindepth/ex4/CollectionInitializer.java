package com.exercises.chapters.containersindepth.ex4;

import java.util.Collections;
import java.util.List;

public class CollectionInitializer {

    public static List<String> getWordsAsListFrom(String path) {
        return new TextFile(path, "\\W");
    }

    public static List<String> getWordsAsListInOrderFrom(String path) {
        List<String> words = getWordsAsListFrom(path);
        Collections.sort(words);
        return words;
    }

    public static List<String> getWordsAsListInReversedOrderFrom(String path) {
        List<String> words = getWordsAsListFrom(path);
        words.sort(Collections.reverseOrder());
        return words;
    }

}
