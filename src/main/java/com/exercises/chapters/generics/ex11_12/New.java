package com.exercises.chapters.generics.ex11_12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> lList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static void main(String[] args) {
        List<Test1> list = New.list();
        Set<Test2> set = New.set();
        Map<Test1, Test2> map = New.map();

        consumer(New.<String>list());
        consumer(New.<String>set());
        consumer(New.<String, Integer>map());
    }

    public static void consumer(Collection collection) {
        System.out.println(collection.getClass().getName());
    }

    public static void consumer(Map map) {
        System.out.println(map.getClass().getName());
    }
}