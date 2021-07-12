package com.exercises.chapters.generics.ex20;

public class Anther {

    public <T extends Inter> void method(T value) {
        value.scoreGoal();
    }

}
