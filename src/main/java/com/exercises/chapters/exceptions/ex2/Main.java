package com.exercises.chapters.exceptions.ex2;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Hello Wolrd!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Another clause!");
        }
    }
}
