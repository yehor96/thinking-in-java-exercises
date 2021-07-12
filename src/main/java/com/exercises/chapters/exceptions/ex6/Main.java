package com.exercises.chapters.exceptions.ex6;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException2();
        } catch (MyException2 e) {
            System.out.println("Lol");
        }
        try {
            throw new MyException1();
        } catch (MyException1 e) {
            System.out.println("Lol");
        }
    }
}
