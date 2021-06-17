package com.chapters.generics.ex22;

public class Main {
    public static void main(String[] args) {

        Creator<String> creatorWithStringArg = new Creator<>(String.class, "hello");
        Creator<Integer> creatorWithIntArg = new Creator<>(int.class, 5);

        System.out.println(creatorWithStringArg.createInstance(String.class));
        System.out.println(creatorWithIntArg.createInstance(Example.class));
    }
}
