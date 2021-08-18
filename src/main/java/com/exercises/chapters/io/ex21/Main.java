package com.exercises.chapters.io.ex21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src\\main\\resources\\Lines.txt";
        capitalize(new InputStreamReader(new FileInputStream(fileName)));
    }

    public static void capitalize(InputStreamReader input) {
        try (var buffer = new BufferedReader(input)) {
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
