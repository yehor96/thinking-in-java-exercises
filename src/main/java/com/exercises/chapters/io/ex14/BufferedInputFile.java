package com.exercises.chapters.io.ex14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    public static String read(String filename) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            String s;
            while ((s = in.readLine()) != null)
                sb.append(s).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}