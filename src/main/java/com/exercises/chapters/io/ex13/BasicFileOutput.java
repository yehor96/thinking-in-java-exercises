package com.exercises.chapters.io.ex13;

import com.exercises.chapters.io.ex14.BufferedInputFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
    static String file = "src\\main\\resources\\BasicFileOutput.out";

    public static void main(String[] args) {
        try (LineNumberReader in = new LineNumberReader(new BufferedReader(new StringReader(BufferedInputFile.read("src\\main\\resources\\Lines.txt"))));
             PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
            String s;
            while ((s = in.readLine()) != null)
                out.println(in.getLineNumber() + "::: " + s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
