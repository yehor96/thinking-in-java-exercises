package com.exercises.chapters.containersindepth.ex8;

public class Main {
    public static void main(String[] args) {
        SList<String> slist = new SList<>();
        SListIterator<String> iterator = slist.iterator();

        iterator.add("Text");
        iterator.add("One more");
        iterator.add("Last one");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
