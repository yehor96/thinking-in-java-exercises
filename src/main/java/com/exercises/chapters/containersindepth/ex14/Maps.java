package com.exercises.chapters.containersindepth.ex14;

import com.exercises.chapters.containersindepth.ex5.CountingMapData;

import java.util.Map;
import java.util.Properties;

public class Maps {
    public static void printKeys(Map<Object, Object> map) {
        System.out.print("Size = " + map.size() + ", ");
        System.out.print("Keys: ");
        System.out.println(map.keySet()); // Produce a Set of the keys
    }

    public static void test(Map<Object, Object> map) {
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
// Map has ‘Set’ behavior for keys:
        map.putAll(new CountingMapData(25));
        printKeys(map);
// Producing a Collection of the values:
        System.out.print("Values: ");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11): " + map.containsKey(11));
        System.out.println("map.get(11): " + map.get(11));
        System.out.println("map.containsValue(\"F0\"): "
                + map.containsValue("F0"));
        Object key = map.keySet().iterator().next();
        System.out.println("First key in map: " + key);
        map.remove(key);
        printKeys(map);
        map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData(25));
// Operations on the Set change the Map:
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }

    public static void main(String[] args) {
        test(new Properties());
    }
}
