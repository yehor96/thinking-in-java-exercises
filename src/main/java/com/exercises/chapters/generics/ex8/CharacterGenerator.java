package com.exercises.chapters.generics.ex8;

import com.exercises.chapters.generics.ex8.interfaces.StoryCharacter;
import com.exercises.chapters.typeinfo.ex12.cofee.Generator;

import java.util.Random;

public class CharacterGenerator implements Generator<StoryCharacter> {

    private static final String defaultSuperpower = "Fighting";
    private static final Random random = new Random();

    @Override
    public StoryCharacter next() {
        return next(defaultSuperpower);
    }

    public StoryCharacter next(String superpower) {
        var characterValues = CharacterFactory.Character.values();
        var randomCharacter = characterValues[random.nextInt(characterValues.length)];
        return CharacterFactory.getCharacter(randomCharacter, superpower);
    }
}
