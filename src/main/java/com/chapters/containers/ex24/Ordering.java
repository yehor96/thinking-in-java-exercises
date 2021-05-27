package com.chapters.containers.ex24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ordering {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("Text", 1);
        hashMap.put("Hell", 15);
        hashMap.put("Abra", 8);
        hashMap.put("Oppa", 3);
        hashMap.put("Zbro", 109);
        display(hashMap);
        System.out.println();

        List<String> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list);
        Map<String, Integer> hashMap2 = new LinkedHashMap<>();
        for (var each : list){
            hashMap2.put(each, hashMap.get(each));
        }
        display(hashMap2);
    }

    public static void display(Map<String, Integer> map) {
        for (var each : map.entrySet()) {
            System.out.println(each.getKey() + " --- " + each.getValue() + " --- " + each.getKey().hashCode());
        }
    }
}
