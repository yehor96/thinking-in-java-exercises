package com.exercises.chapters.containersindepth.ex2;

import com.exercises.chapters.containersindepth.ex1.Countries;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {
        char letter = 'N';

        Set<String> countrySet = Countries.names().stream()
                .filter(c -> c.startsWith(Character.toString(letter)))
                .collect(Collectors.toSet());

        Map<String, String> countryMap = Countries.capitals().entrySet().stream()
                .filter(c -> c.getKey().startsWith(Character.toString(letter)))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(countrySet);
        System.out.println(countryMap);
    }
}
