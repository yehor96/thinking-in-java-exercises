package com.chapters.generics.ex8;

import com.chapters.generics.ex8.interfaces.StoryCharacter;
import com.chapters.typeinfo.ex12.cofee.Generator;

import java.util.Random;

public class CharacterGenerator implements Generator<StoryCharacter> {

    private static final String defaultSuperpower = "Fighting";
    private static final Random random = new Random();

    @Override
    public StoryCharacter next() {
        return next(defaultSuperpower);
    }

    public StoryCharacter next(String superpower) {
        int size = CharacterFactory.Character.values().length;
        var randomCharacter = CharacterFactory.Character.values()[random.nextInt(size)];
        return CharacterFactory.getCharacter(randomCharacter, superpower);
    }
}
