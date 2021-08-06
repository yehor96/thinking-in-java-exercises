package com.exercises.chapters.io.ex2;

import java.io.File;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        File dir = new File("src\\main\\java\\com\\exercises\\random\\advanture");
        SortedDirList sortedDirList = new SortedDirList(dir);

        System.out.println("Simple list()");
        Stream.of(sortedDirList.list()).forEach(System.out::println);
        System.out.println("Regex list()");
        Stream.of(sortedDirList.list("Diamond")).forEach(System.out::println);
    }
}
