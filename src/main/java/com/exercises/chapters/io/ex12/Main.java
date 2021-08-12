package com.exercises.chapters.io.ex12;

import com.exercises.chapters.io.ex7_8_9.LineReader;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String readFromFile = "src\\main\\resources\\Lines.txt";
        String writeIntoFile = "src\\main\\resources\\Test3.txt";

        LinkedList<String> lines = new LinkedList<>();
        LineReader.readInto(readFromFile, lines);
        LineWriter.writeInto(writeIntoFile, lines);
    }
}
