package com.exercises.chapters.io.ex7_8_9;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String filename;

        if (args.length == 0) {
            filename = "src\\main\\resources\\Lines.txt";
        } else if (args.length == 1) {
            filename = args[0];
        } else {
            throw new IllegalArgumentException("Too many arguments!");
        }

        LinkedList<String> lines = new LinkedList<>();
        Reader.readInto(filename, lines);

        var listIterator = lines.listIterator(lines.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().toUpperCase());
        }
    }
}
