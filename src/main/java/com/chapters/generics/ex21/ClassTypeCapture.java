package com.chapters.generics.ex21;

import java.util.ArrayList;
import java.util.List;

class Building {
}

class House extends Building {
}

public class ClassTypeCapture {
    private List<Class<?>> kinds = new ArrayList<>();

    public ClassTypeCapture(Class<?> kind) {
        addType(kind);
    }

    public void addType(Class<?> kind) {
        kinds.add(kind);
    }

    public Object createNew(Class<?> kind) {
        if (!kinds.contains(kind)) {
            throw new IllegalArgumentException("There is no such kind");
        }

        try {
            return kind.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean f(Object arg) {
        return kinds.stream().anyMatch(v -> v.isInstance(arg));
    }

    public static void main(String[] args) {
        ClassTypeCapture ctt1 = new ClassTypeCapture(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        ctt1.addType(String.class);
        System.out.println(ctt1.f("String"));
        System.out.println(ctt1.createNew(String.class).getClass().getSimpleName());

        ClassTypeCapture ctt2 = new ClassTypeCapture(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

        ctt2.addType(Integer.class);
        System.out.println(ctt2.f("Integer"));
        System.out.println(ctt2.createNew(Integer.class).getClass().getSimpleName());
    }
}