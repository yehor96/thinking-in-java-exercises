package com.chapters.generics.ex22;

import java.lang.reflect.InvocationTargetException;

public class Creator<E> {

    private final Class<?> argType;

    public Creator(Class<E> argType) {
        this.argType = argType;
    }

    public E createWithInt(int argument) {
        return createInstance(int.class, argument);
    }

    public E createWithString(String argument) {
        return createInstance(String.class, argument);
    }

    @SuppressWarnings("unchecked")
    private E createInstance(Class<?> typeParameter, Object argument) {
        try {
            return (E) argType.getConstructor(typeParameter).newInstance(argument);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(
                    e + " Provided class does not have a constructor with parameter " + argType.getSimpleName());
        }
    }
}
