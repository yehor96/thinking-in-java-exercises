package com.exercises.chapters.typeinfo.ex19;

import java.lang.reflect.InvocationTargetException;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    Toy() {
        System.out.println("Default constructor is called");
    }
    Toy(int i) {
        System.out.println("Non default constructor is called with value " + i);
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class<? extends Toy> c = getClassByName("com.chapters.typeinfo.ex19.FancyToy");
        printInfo(c);
        for (Class<?> face : c.getInterfaces())
            printInfo(face);
        Class<?> up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.getDeclaredConstructor().newInstance();
            up.getDeclaredConstructor(int.class).newInstance(5);
        } catch (InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }

    public static Class<? extends Toy> getClassByName(String name) {
        Class<? extends Toy> tClass = null;
        try {
            tClass = (Class<? extends Toy>) Class.forName(name);
        } catch (ClassNotFoundException e) {
            System.out.println("Can’t find FancyToy");
            System.exit(1);
        }
        return tClass;
    }
}
