package com.chapters.containers.ex21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main21 {

    public static void main(String[] args) {
        String words = readFile("Words.txt");

        Map<String, Integer> dictionary = new HashMap<>();
        for(var each : words.split(" ")) {
            var word = each.toLowerCase();
            var counter = dictionary.get(word);
            if (counter == null) {
                dictionary.put(word, 1);
            } else {
                dictionary.put(word, ++counter);
            }
        }

        Map<String, Integer> sortedMap = sortMap(dictionary);
        System.out.println(sortedMap);

    }

    public static Map<String, Integer> sortMap(Map<String, Integer> map) {
        var wordList = new ArrayList<>(map.keySet());
        wordList.sort(String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        wordList.forEach(word -> {
            int counter = map.get(word);
            sortedMap.put(word, counter);
        });

        return sortedMap;
    }

    public static String readFile(String path) {
        File file = new File(path);
        String content = "";
        try (Scanner myReader = new Scanner(file)) {
            while (myReader.hasNext()) {
                content = myReader.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found. " + e.getMessage());
        }
        return content;
    }

}
