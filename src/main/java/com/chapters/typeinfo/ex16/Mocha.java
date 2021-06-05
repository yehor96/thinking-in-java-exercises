package com.chapters.typeinfo.ex16;

public class Mocha extends Coffee {
    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Mocha> {
        public Mocha create() {
            return new Mocha();
        }
    }
}
