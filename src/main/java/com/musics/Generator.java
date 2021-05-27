package com.musics;

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
                new Music3.Wind(),
                new Music3.Percussion(),
                new Music3.Stringed(),
                new Music3.Brass(),
                new Music3.Woodwind(),
                new Music3.Hernia()
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
