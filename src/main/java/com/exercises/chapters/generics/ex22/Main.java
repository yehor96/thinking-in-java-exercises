package com.exercises.chapters.generics.ex22;

public class Main {
    public static void main(String[] args) {

        Creator<Example> creator = new Creator<>(Example.class);

        System.out.println(creator.createWithString("text"));
        System.out.println(creator.createWithInt(5));
    }
}
