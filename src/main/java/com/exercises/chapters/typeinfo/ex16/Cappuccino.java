package com.exercises.chapters.typeinfo.ex16;

public class Cappuccino extends Coffee {
    public static class Factory implements com.exercises.chapters.typeinfo.ex16.Factory<Cappuccino> {
        public Cappuccino create() {
            return new Cappuccino();
        }
    }
}
