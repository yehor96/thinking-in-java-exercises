package com.exercises.chapters.generics.ex8.characters;

import com.exercises.chapters.generics.ex8.interfaces.BadCharacter;

public class Golum implements BadCharacter {

    private final String superpower;

    public Golum(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String getSuperpower() {
        return superpower;
    }
}
