package com.exercises.chapters.typeinfo.ex16;

public class Latte extends Coffee {
    public static class Factory implements com.exercises.chapters.typeinfo.ex16.Factory<Latte> {
        public Latte create() {
            return new Latte();
        }
    }
}
