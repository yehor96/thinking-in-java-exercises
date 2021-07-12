package com.exercises.chapters.typeinfo.ex16;

public class Breve extends Coffee {

    public static class Factory implements com.exercises.chapters.typeinfo.ex16.Factory<Breve> {
        public Breve create() {
            return new Breve();
        }
    }

}
