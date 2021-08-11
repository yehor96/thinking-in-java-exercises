package com.exercises.chapters.io.ex10;

import com.exercises.chapters.io.ex7_8_9.Reader;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String filename;
        LinkedList<String> lines = new LinkedList<>();

        if (args.length == 0) {
            filename = "src\\main\\resources\\Lines.txt";
            Reader.readInto(filename, lines);
        } else if (args.length == 1) {
            filename = args[0];
            Reader.readInto(filename, lines);
        } else {
            filename = args[0];
            String[] words = new String[args.length - 1];
            System.arraycopy(args, 1, words, 0, args.length - 1);

            Reader.readWordsInto(filename, lines, words);
        }

        var listIterator = lines.listIterator(lines.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
