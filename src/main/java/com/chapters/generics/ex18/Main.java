package com.chapters.generics.ex18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        List<BigFish> bigFish = new ArrayList<>();
        List<LitteFish> littleFish = new ArrayList<>();
        Generators.fill(bigFish, BigFish.generator, 10);
        Generators.fill(littleFish, LitteFish.generator, 11);

        bigFish.forEach(bf -> Ocean.natureProcess(bf, littleFish.remove(random.nextInt(littleFish.size()))));
        littleFish.forEach(lf -> System.out.println("Survived little fish - " + lf));
    }

}
