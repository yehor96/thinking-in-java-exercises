package com.exercises.chapters.io.ex7_8_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

public class Reader {

    public static void readInto(String filename, Collection<String> collection) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null)
                collection.add(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
