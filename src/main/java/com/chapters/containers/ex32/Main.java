package com.chapters.containers.ex32;

import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence(8);
        display(nc.iterator());

        System.out.println();
        for(var each : nc) {
            System.out.print(each + " ");
        }

        System.out.println();
        for(var each : nc.reversed()) {
            System.out.print(each + " ");
        }

        System.out.println();
        for(var each : nc.randomized()) {
            System.out.print(each + " ");
        }
    }

    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.getId() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets)
            System.out.print(p.getId() + ":" + p + " ");
        System.out.println();
    }
}
