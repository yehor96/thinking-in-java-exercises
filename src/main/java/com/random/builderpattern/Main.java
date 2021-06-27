package com.random.builderpattern;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Vasyl")
                .age(22)
                .nationality("Ukraine")
                .sex(SEX.MALE).build();

        System.out.println(person);
    }
}
