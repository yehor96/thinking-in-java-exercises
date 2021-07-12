package com.exercises.chapters.generics.ex24;

import java.util.HashMap;
import java.util.Map;

interface Factory<T> {
    T create();
}

interface Factoriable{

}

class Building implements Factoriable {

    public static class BuildingFactory implements Factory<Building> {
        @Override
        public Building create() {
            return new Building();
        }
    }
}

class House extends Building {

    public static class HouseFactory implements Factory<House> {
        @Override
        public House create() {
            return new House();
        }
    }
}

public class ClassTypeCapture<T> {

    private final Map<Class<? extends Factoriable>, Factory<? extends T>> typeStorage = new HashMap<>();

    public ClassTypeCapture(Class<? extends Factoriable> type, Factory<? extends T> factory) {
        addType(type, factory);
    }

    public void addType(Class<? extends Factoriable> type, Factory<? extends T> factory) {
        typeStorage.put(type, factory);
    }

    public T createNew(Class<? extends Factoriable> type) {
        if (!typeStorage.containsKey(type)) {
            throw new IllegalArgumentException("There is no such type");
        }

        try {
            return typeStorage.get(type).create();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean f(Object arg) {
        return typeStorage.keySet().stream().anyMatch(v -> v.isInstance(arg));
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class, new Building.BuildingFactory());
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        System.out.println(ctt1.createNew(Building.class));

        ClassTypeCapture<Building> ctt2 = new ClassTypeCapture<>(House.class, new  House.HouseFactory());
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

        System.out.println(ctt2.createNew(House.class));
    }
}