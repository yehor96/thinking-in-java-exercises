package com.exercises.chapters.containersindepth.ex40_41_42;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex41 {
    private static Random random = new Random();

    public static void main(String[] args) {
        Set<Container> set = Stream.generate(Container::getContainer)
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(set);

        var sameItem = Container.getContainer();
        System.out.println(sameItem);
        set.add(sameItem);
        set.add(sameItem);
        System.out.println(set);

        System.out.println("====================");

        Map<Container, Integer> map = new HashMap<>();
        set.forEach(c -> map.put(c, random.nextInt()));

        System.out.println(map);
    }
}
