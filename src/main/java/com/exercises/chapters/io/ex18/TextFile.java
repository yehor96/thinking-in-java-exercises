package com.exercises.chapters.io.ex18;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {

    private static final String THIS_FILE_PATH =
            "src\\main\\java\\com\\exercises\\chapters\\containersindepth\\ex4\\TextFile.java";
    private static final String TEST_FILE_PATH =
            "src\\main\\resources\\Test.txt";
    private static final String TEST_2_FILE_PATH =
            "src\\main\\resources\\Test2.txt";

    // Read a file as a single string:
    public static String read(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()))) {
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    // Write a single file in one method call:
    public static void write(String fileName, String text) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(
                new File(fileName).getAbsoluteFile())) {
            out.print(text);
        }
    }

    // Read a file, split by any regular expression:
    public TextFile(String fileName, String splitter) throws IOException {
        super(Arrays.asList(read(fileName).split(splitter)));
        // Regular expression split() often leaves an empty
        // String at the first position:
        if (get(0).equals("")) remove(0);
    }

    // Normally read by lines:
    public TextFile(String fileName) throws IOException {
        this(fileName, "\n");
    }

    public void write(String fileName) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(
                new File(fileName).getAbsoluteFile())) {
            for (String item : this)
                out.println(item);
        }
    }

    // Simple test:
    @SneakyThrows
    public static void main(String[] args) {
        String file = read(THIS_FILE_PATH);
        write(TEST_FILE_PATH, file);
        com.exercises.chapters.containersindepth.ex4.TextFile text = new com.exercises.chapters.containersindepth.ex4.TextFile(TEST_FILE_PATH);
        text.write(TEST_2_FILE_PATH);
        // Break into unique sorted list of words:
        TreeSet<String> words = new TreeSet<>(new com.exercises.chapters.containersindepth.ex4.TextFile(THIS_FILE_PATH, "\\W+"));
        // Display the capitalized words:
        System.out.println(words.headSet("a"));
    }
}
