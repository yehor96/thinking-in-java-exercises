package com.chapters.generics.ex13;

import com.chapters.generics.ex7.Fibonacci;
import com.chapters.typeinfo.ex12.cofee.Coffee;
import com.chapters.typeinfo.ex12.cofee.CoffeeGenerator;
import com.chapters.typeinfo.ex12.cofee.Generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Generators {

    public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }


    public static void main(String[] args) {
        Queue<Coffee> coffee = fill((Queue<Coffee>) new LinkedList<Coffee>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffee)
            System.out.println(c);

        List<Integer> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for(int i : fnumbers)
            System.out.print(i + ", ");
    }
}
