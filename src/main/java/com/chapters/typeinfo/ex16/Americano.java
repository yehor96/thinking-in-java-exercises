package com.chapters.typeinfo.ex16;

public class Americano extends Coffee {

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Americano> {
        public Americano create() {
            return new Americano();
        }
    }

}
