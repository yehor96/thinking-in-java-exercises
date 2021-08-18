package com.exercises.chapters.io.ex19;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "src\\main\\resources\\Lines.txt";
        Map<Byte, Integer> map = new HashMap<>();

        try {
            for (Byte bt : BinaryFile.read(fileName)) {
                Integer counter = map.get(bt);
                if (counter == null) {
                    map.put(bt, 1);
                } else {
                    map.put(bt, ++counter);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(map);
    }
}
