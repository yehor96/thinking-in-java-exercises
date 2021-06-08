package com.chapters.typeinfo.ex24;

import com.chapters.typeinfo.ex13.Part;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(Part.createRandom());
    }
}
