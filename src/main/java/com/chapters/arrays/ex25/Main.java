package com.chapters.arrays.ex25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(list.getClass().getTypeName());
        System.out.println(list);
        System.out.println(list.get(4));
        list.add(6);
        list.addAll(List.of(7, 8));
        var sublist = list.subList(2, 4);
        System.out.println(sublist);

        MyList<Integer> list2 = new MyList<>(list);
        System.out.println(list2.getClass().getTypeName());
        System.out.println(list2.getReversed());
    }

    static class MyList<T> extends ArrayList<T> {
        public MyList(List<T> list) {
            super(list);
        }

        public List<T> getReversed() {
            this.sort(Collections.reverseOrder());
            return this;
        }
    }
}
