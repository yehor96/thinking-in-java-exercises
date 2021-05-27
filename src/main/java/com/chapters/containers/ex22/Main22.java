package com.chapters.containers.ex22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main22 {

    public static void main(String[] args) {
        String words = readFile("src\\main\\resources\\Words.txt");
        List<Word> list = new ArrayList<>();
        Stream.of(words.split(" ")).forEach(w -> list.add(new Word(w)));

        Set<Word> dictionary = new TreeSet<>();

        for (var word : list) {
            if (!dictionary.add(word)) {
                for (Word item : dictionary) {
                    if (item.equals(word)) {
                        item.incrementCounter();
                    }
                }
            }
        }
        System.out.println(dictionary);
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
