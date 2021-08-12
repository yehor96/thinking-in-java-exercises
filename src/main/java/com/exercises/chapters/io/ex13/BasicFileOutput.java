package com.exercises.chapters.io.ex13;

import com.exercises.chapters.io.ex7_8_9.LineReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BasicFileOutput {
    static String file1 = "src\\main\\resources\\Test2.txt";
    static String file2 = "src\\main\\resources\\Test3.txt";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        LineReader.readInto("src\\main\\resources\\LinesMore.txt", list);

        long time1 = System.currentTimeMillis();
        bufferedOperation(list);
        System.out.println("buffered: " + (System.currentTimeMillis() - time1));

        long time2 = System.currentTimeMillis();
        notBufferedOperation(list);
        System.out.println("notbuffered: " + (System.currentTimeMillis() - time2));
    }

    public static void bufferedOperation(List<String> list) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file1)))) {
            int lineCount = 0;
            for (var line : list) {
                out.println(lineCount++ + ": " + line);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void notBufferedOperation(List<String> list) {
        try (PrintWriter out = new PrintWriter(new FileWriter(file2))) {
            int lineCount = 0;
            for (var line : list) {
                out.println(lineCount++ + ": " + line);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}