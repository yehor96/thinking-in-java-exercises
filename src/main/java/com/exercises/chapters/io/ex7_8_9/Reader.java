package com.exercises.chapters.io.ex7_8_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {

    public static void readInto(String filename, Collection<String> collection) {
        collection.addAll(readLines(filename));
    }

    public static void readWordsInto(String filename, Collection<String> collection, String... words) {
        collection.addAll(readLines(filename).stream()
                .filter(l -> Stream.of(words).anyMatch(l::contains))
                .collect(Collectors.toList()));
    }

    private static List<String> readLines(String filename) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null)
                lines.add(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
