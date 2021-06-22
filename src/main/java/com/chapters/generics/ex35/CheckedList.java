package com.chapters.generics.ex35;

import com.chapters.typeinfo.ex12.cofee.Americano;
import com.chapters.typeinfo.ex12.cofee.Coffee;
import com.chapters.typeinfo.ex12.cofee.Latte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {

    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyLatte) {
        probablyLatte.add(new Americano());
    }

    public static void main(String[] args) {

        List<Latte> lattes = new ArrayList<>();
        oldStyleMethod(lattes);

        List<Latte> lates2 = Collections.checkedList(new ArrayList<>(), Latte.class);
        try {
            oldStyleMethod(lates2);
        } catch (Exception e) {
            System.out.println(e);
        }

        List<Coffee> pets = Collections.checkedList(new ArrayList<>(), Coffee.class);
        pets.add(new Latte());
        pets.add(new Americano());
    }
}
