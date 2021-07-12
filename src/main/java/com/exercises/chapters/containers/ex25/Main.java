package com.exercises.chapters.containers.ex25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String words = readFile("Words.txt");

        var map = readWordsIntoMap(words);

        System.out.println(map);
    }

    public static Map<String, List<Integer>> readWordsIntoMap(String words) {
        Map<String, List<Integer>> dictionary = new HashMap<>();
        String[] arrayWords = words.split(" ");

        for (int i = 0; i < arrayWords.length; i++) {
            String word = arrayWords[i];
            List<Integer> list;

            if (!dictionary.containsKey(word)) {
                list = new ArrayList<>();
                dictionary.put(word, list);
            } else {
                list = dictionary.get(word);
            }
            list.add(i);
        }

        return dictionary;
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
