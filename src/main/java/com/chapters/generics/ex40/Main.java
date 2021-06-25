package com.chapters.generics.ex40;

import com.chapters.typeinfo.ex11.Pet;
import com.chapters.typeinfo.ex11.Pets;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets = Arrays.asList(Pets.createArray(10));
        Method method = Apply.toMethod(Pet.class, "speak");
        Apply.apply(pets, method);
    }
}

class Apply {
    public static Method toMethod(Class<?> token, String methodName) {
        try {
            return token.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq)
                f.invoke(t, args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
