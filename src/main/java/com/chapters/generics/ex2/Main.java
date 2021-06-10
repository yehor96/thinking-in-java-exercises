package com.chapters.generics.ex2;

public class Main {
    public static void main(String[] args) {

        Holders<String> holders = new Holders<>("Text", "Two", "Last");
        System.out.println(holders);

        System.out.println(holders.getItem(0));
        holders.setItem("New", 1);
        System.out.println(holders);
    }
}
