package com.chapters.generics.ex8.characters;

import com.chapters.generics.ex8.interfaces.BadCharacter;

public class Orc implements BadCharacter {

    private final String superpower;

    public Orc(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String getSuperpower() {
        return superpower;
    }
}