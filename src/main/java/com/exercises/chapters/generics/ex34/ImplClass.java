package com.exercises.chapters.generics.ex34;

public class ImplClass extends SelfBoundClass<ImplClass> {

    @Override
    protected ImplClass abstractMethod(ImplClass im) {
        System.out.println("Inside impl class");
        return im;
    }
}
