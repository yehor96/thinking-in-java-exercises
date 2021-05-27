package com.chapters.exceptions.ex4;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Info");
        } catch(MyException e) {
            System.out.println(e);
            System.out.println(e.getTxt());
        }
    }
}
