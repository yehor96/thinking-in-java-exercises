package com.exercises.chapters.io.ex27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "src\\main\\resources\\color.out";

        Green green = new Green();
        green.num = 10;
        Color color = new Color(green);
        Color color2;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(color);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            color2 = (Color) in.readObject();
        }

        System.out.println(color2);
    }
}
