package com.exercises.chapters.typeinfo.ex26;

import com.exercises.random.musics.Playable;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Generator {

    private final List<Playable> ORCHESTRA;

    public Generator() {
        ORCHESTRA = new LinkedList<>();
        ORCHESTRA.addAll(Arrays.asList(
                new Music4RTTI.Wind(),
                new Music4RTTI.Percussion(),
                new Music4RTTI.Stringed(),
                new Music4RTTI.Brass(),
                new Music4RTTI.Woodwind(),
                new Music4RTTI.Hernia()
        ));
    }

    public Playable getRandom() {
        Collections.shuffle(ORCHESTRA);
        return ORCHESTRA.get(0);
    }

    public Playable[] getRandoms(int number) {
        return Stream.generate(this::getRandom)
                .limit(number)
                .toArray(Playable[]::new);
    }
}
