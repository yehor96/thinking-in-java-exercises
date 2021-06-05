package com.chapters.typeinfo.ex11;

import com.chapters.typeinfo.ex12.TypeCounter;

public class Main {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}