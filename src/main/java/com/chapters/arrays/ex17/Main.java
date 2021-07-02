package com.chapters.arrays.ex17;

import com.chapters.arrays.ex15.Generated;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var array = Generated.array(BigDecimal.class, new BigDecimalGenerator(), 10);
        System.out.println(Arrays.toString(array));
    }
}
