package com.exercises.chapters.containersindepth.ex18;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SlowSet<V> extends AbstractSet<V> {

    private final List<V> values = new ArrayList<>();

    @Override
    public Iterator<V> iterator() {
        return values.iterator();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean add(V v) {
        if(!contains(v)) {
            values.add(v);
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends V> c) {
        boolean modified = false;
        for (var each : c) {
            if(add(each)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean contains(Object o) {
        return values.contains(o);
    }

    public static void main(String[] args) {
        Set<String> set = new SlowSet<>();
        set.add("Text");
        set.add("Hello");
        set.add("Another");
        set.add("Hello");
        set.add("Hello");
        set.add("text");

        System.out.println("Size: " + set.size());
        for (var each : set) {
            System.out.println(each);
        }

        System.out.println("Size: " + set.size());
        System.out.println(set.addAll(List.of("Text", "Hello", "Text")));
        System.out.println("Size: " + set.size());
        System.out.println(set.addAll(List.of("New", "New2", "New2")));
        System.out.println("Size: " + set.size());
    }
}
