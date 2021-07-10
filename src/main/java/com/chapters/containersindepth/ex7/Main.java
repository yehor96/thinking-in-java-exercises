package com.chapters.containersindepth.ex7;

import com.chapters.containersindepth.ex1.Countries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Countries.names(5));
        List<String> linkedList = new LinkedList<>(Countries.names(7));

        System.out.println("Iteration of array list:");
        printWithIterator(arrayList.iterator());
        System.out.println("Iteration of linked list:");
        printWithIterator(linkedList.iterator());

        insertIntoListStartingAtStart(arrayList, linkedList);
        System.out.println("Iteration of array list (after adding linked list at start):");
        printWithIterator(arrayList.iterator());

        insertIntoListStartingAtEnd(arrayList, linkedList);
        System.out.println("Iteration of array list (after adding linked list at end):");
        printWithIterator(arrayList.iterator());
    }

    // Adding at every other position from start. Leftovers from src are added at the back
    public static void insertIntoListStartingAtStart(List<String> dest, List<String> src) {
        var destListIterator = dest.listIterator();
        var srcListIterator = src.listIterator();
        while(destListIterator.hasNext() && srcListIterator.hasNext()) {
            destListIterator.add(srcListIterator.next() + "*");
            destListIterator.next();
        }
        while(srcListIterator.hasNext()) {
            destListIterator.add(srcListIterator.next() + "*");
        }
    }

    // Adding at every other position from end. Leftovers from src are added at the start
    public static void insertIntoListStartingAtEnd(List<String> dest, List<String> src) {
        var destListIterator = dest.listIterator(dest.size());
        var srcListIterator = src.listIterator();

        while(destListIterator.hasPrevious() && srcListIterator.hasNext()) {
            destListIterator.add(srcListIterator.next() + "#");
            destListIterator.previous();
            destListIterator.previous();
        }
        while(srcListIterator.hasNext()) {
            destListIterator.add(srcListIterator.next() + "#");
        }
    }

    public static void printWithIterator(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
