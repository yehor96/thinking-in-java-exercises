package com.exercises.chapters.containersindepth.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var modifiableList = new ArrayList<>(Arrays.asList("t", "q", "asdasd", "ddd"));
        var unmodifiable = Collections.unmodifiableList(modifiableList);

        processList(modifiableList, "modifiable");
        processList(unmodifiable, "unmodifiable");
    }

    public static void processList(List<String> list, String msg) {
        System.out.println("++++++ " + msg + " ++++++");
        try {
            list.add(0, msg);
        } catch (UnsupportedOperationException e) {
            System.out.println("list.add " + e);
        }

        try {
            list.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("list.remove " + e);
        }
    }
}
