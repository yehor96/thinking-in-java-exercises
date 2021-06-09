package com.chapters.typeinfo.ex25.securepackage;

public class PrivateThings {

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void packageAccessMethod() {
        System.out.println("packageAccessMethod");
    }

}
