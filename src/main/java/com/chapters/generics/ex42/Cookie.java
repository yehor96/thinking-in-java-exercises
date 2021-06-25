package com.chapters.generics.ex42;

public class Cookie {

    private String cookie;

    public Cookie(String cookie) {
        this.cookie = cookie;
    }

    public void modify() {
        cookie += " #";
    }

    @Override
    public String toString() {
        return cookie;
    }

}
