package com.chapters.containers.ex26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.chapters.containers.ex25.Main.readFile;
import static com.chapters.containers.ex25.Main.readWordsIntoMap;

public class Main26 {
    public static void main(String[] args) {
        String words = readFile("Words.txt");

        var map = readWordsIntoMap(words);

        writeWordsFromMap(map);
    }

    public static void writeWordsFromMap(Map<String, List<Integer>> map) {
        List<String> finalWords = new ArrayList<>();
        increaseSizeOfList(map.size(), finalWords);

        for (var item : map.entrySet()) {
            List<Integer> listOfIndexes = item.getValue();
            String word = item.getKey();

            listOfIndexes.forEach(index -> {
                if (index >= finalWords.size()) {
                    int diff = index - finalWords.size() + 1;
                    increaseSizeOfList(diff, finalWords);
                }
                finalWords.set(index, word);
            });
        }

        displayListAsWords(finalWords);
    }

    public static void increaseSizeOfList(int size, List<String> list) {
        for (int i = 0; i < size; i++) {
            list.add("");
        }
    }

    public static void displayListAsWords(List<String> list) {
        list.forEach(word -> System.out.print(word + " "));
    }
}
