package com.chapters.containers.ex23;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> totalMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            var result = runWithRandomNumbers(1000);
            int highOccurringNum = getMaxFromMap(result);
            countFreq(totalMap, highOccurringNum);
        }

        System.out.println("##################################");
        System.out.println(totalMap);

        System.out.println("The winner is number '" + getMaxFromMap(totalMap) + "' !!!");
    }

    public static int getMaxFromMap(Map<Integer, Integer> map) {
        var maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        return maxEntry.orElseThrow().getKey();
    }

    public static Map<Integer, Integer> runWithRandomNumbers(int numberOfTimes) {
        Map<Integer, Integer> map = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < numberOfTimes; i++) {
            countFreq(map, rand.nextInt(10));
        }
        System.out.println(map);
        return map;
    }

    public static void countFreq(Map<Integer, Integer> map, int item) {
        Integer freq = map.get(item);
        map.put(item, freq == null ? 1 : freq + 1);
    }
}
