package com.chapters.generics.ex42;

public class Cache {

    private String cache;

    public Cache(String cookie) {
        this.cache = cookie;
    }

    public void update() {
        cache += " @";
    }

    @Override
    public String toString() {
        return cache;
    }
}
