package com.exercises.chapters.exceptions.ex26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ex26 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("MainException2.java");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
