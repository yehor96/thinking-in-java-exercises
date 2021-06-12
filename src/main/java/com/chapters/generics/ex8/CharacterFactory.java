package com.chapters.generics.ex8;

import com.chapters.generics.ex8.characters.Aragorn;
import com.chapters.generics.ex8.characters.Gendalf;
import com.chapters.generics.ex8.characters.Ghimli;
import com.chapters.generics.ex8.characters.Golum;
import com.chapters.generics.ex8.characters.Legolas;
import com.chapters.generics.ex8.characters.Orc;
import com.chapters.generics.ex8.characters.Sauron;
import com.chapters.generics.ex8.interfaces.StoryCharacter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class CharacterFactory {

    private CharacterFactory() {

    }

    public static StoryCharacter getCharacter(Character character, String superpower) {
        StoryCharacter storyCharacter = null;
        try {
            Constructor<?> constructor = character.getClassInstance().getConstructor(String.class);
            storyCharacter = (StoryCharacter) constructor.newInstance(superpower);
        } catch (InstantiationException |
                IllegalAccessException |
                InvocationTargetException |
                NoSuchMethodException e) {
            throw new RuntimeException(e +
                    " Not able to create a character "
                    + character.getClassInstance().getSimpleName() +
                    " with superpower " + superpower);
        }

        return storyCharacter;
    }

    public enum Character {
        ARAGORN(Aragorn.class), GENDALF(Gendalf.class), GHIMLI(Ghimli.class),
        GOLUM(Golum.class), ORC(Orc.class), SAURON(Sauron.class), LEGOLAS(Legolas.class);

        Character(Class aClass) {
            this.aClass = aClass;
        }

        public Class aClass;

        public Class getClassInstance() {
            return aClass;
        }
    }

}
