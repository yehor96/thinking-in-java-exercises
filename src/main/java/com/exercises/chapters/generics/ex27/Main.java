package com.exercises.chapters.generics.ex27;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // fails:
        // List<Number> nums = new ArrayList<Integer>();

        List<? extends Number> nums = new ArrayList<Integer>();

        // fails:
        // nums.add(5);
        Number n = nums.get(0);
    }

}