package com.exercises.chapters.typeinfo.ex13;

import com.exercises.chapters.typeinfo.ex24.IPart;
import com.exercises.chapters.typeinfo.ex24.NullPartProvider;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part implements IPart {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part>> partFactories = new ArrayList<>();

    static {
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }

    private static Random rand = new Random();

    public static IPart createRandom() {
        int n = rand.nextInt(partFactories.size());
        IPart part = rand.nextInt(10) == 0 ? getNullPart(n) : getValidPart(n);
        return part;
    }

    private static IPart getNullPart(int n) {
        return NullPartProvider.newNullPart(getValidPart(n).getClass());
    }

    private static Part getValidPart(int n) {
        Part part = null;
        try {
            part = partFactories.get(n).getDeclaredConstructor().newInstance();
        } catch (InstantiationException |
                NoSuchMethodException |
                IllegalAccessException |
                InvocationTargetException e) {
            e.printStackTrace();
        }
        return part;
    }
}
