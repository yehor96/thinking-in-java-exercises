package com.chapters.generics.ex22;

import java.lang.reflect.InvocationTargetException;

public class Creator<E> {

    private final Class<?> argType;
    private final Object argument;

    public Creator(Class<? extends E> argType, Object argument) {
        this.argType = argType;
        this.argument = argument;
    }

    public <T> T createInstance(Class<? extends T> type) {
        try {
            return type.getConstructor(argType).newInstance(argument);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(
                    e + " Provided class does not have a constructor with parameter " + argType.getSimpleName());
        }
    }
}
