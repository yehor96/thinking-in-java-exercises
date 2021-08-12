package com.exercises.chapters.io.ex12;

import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@UtilityClass
public class LineWriter {

    public static void writeInto(String filename, Iterable<String> values) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            int counter = 0;
            for (var line : values) {
                if (line.isBlank()) {
                    writer.println(line);
                } else {
                    writer.println(counter++ + " " + line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
