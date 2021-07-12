package com.exercises.chapters.generics.ex30;

import com.exercises.chapters.generics.ex1.Holder3;

public class Main {
    public static void main(String[] args) {
        processHolder(new Holder3<>(5), 10);
        processHolder(new Holder3<>('c'), 'a');
        processHolder(new Holder3<>(1.0), 3.2);
        processHolder(new Holder3<>(6L), 1L);
        processHolder(new Holder3<>((short) 3), (short) 18);
        processHolder(new Holder3<>((byte) 1), (byte) 8);
    }

    public static <T> void processHolder(Holder3<T> holder, T value) {
        System.out.println(value.getClass().getSimpleName());
        System.out.println(holder.get());
        holder.set(value);
        System.out.println(holder.get());
    }
}
