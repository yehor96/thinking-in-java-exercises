package com.chapters.generics.ex26;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Number[] nums = new Integer[]{3, 4, 5};
        nums[0] = 5;
        Stream.of(nums).forEach(System.out::print);
    }

}
