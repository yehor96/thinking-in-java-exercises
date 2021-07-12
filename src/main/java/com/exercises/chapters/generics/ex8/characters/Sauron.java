package com.exercises.chapters.generics.ex8.characters;

import com.exercises.chapters.generics.ex8.interfaces.BadCharacter;

public class Sauron implements BadCharacter {

    private final String superpower;

    public Sauron(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String getSuperpower() {
        return superpower;
    }
}