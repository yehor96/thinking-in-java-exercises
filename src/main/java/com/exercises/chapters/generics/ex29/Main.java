package com.exercises.chapters.generics.ex29;

import com.exercises.chapters.generics.ex1.Holder3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Holder3<?> withText = new Holder3<>("Initial text");
        List<Holder3<?>> list = new ArrayList<>();
        list.add(withText);
        Holder3<List<?>> holder = new Holder3<>(list);
        holderOfList(holder);
        var value = holder.get();
        System.out.println(value);

        listOfHolder(list);
        System.out.println(list);
    }


    public static void holderOfList(Holder3<List<?>> holder) {
        List<?> list = holder.get();
        Object val = list.get(0);
        System.out.println(val);
        //not able to call:
        //list.add(new Object());
        //list.set(new Object());
        List<String> newArray = List.of("New text");
        holder.set(newArray);
    }

    public static void listOfHolder(List<Holder3<?>> list) {
        Holder3<?> holder = list.get(0);
        System.out.println(holder);
        //not able to call:
        //holder.set(new Object());
        Object val = holder.get();
        System.out.println(val);
        list.add(new Holder3<>("String"));
    }


}
