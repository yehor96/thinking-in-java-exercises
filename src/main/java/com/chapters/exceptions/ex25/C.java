package com.chapters.exceptions.ex25;

public class C extends B {
    @Override
    public void method() throws Exc3 {
        throw new Exc3();
    }
}
