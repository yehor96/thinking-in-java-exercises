package com.chapters.innerclass;

public class SecondClass {

    public class Insider extends WithInner.Inner {
        public Insider(WithInner with, int value) {
            with.super(value);
        }
    }
}
