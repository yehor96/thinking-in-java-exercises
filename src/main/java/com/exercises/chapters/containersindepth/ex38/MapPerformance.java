package com.exercises.chapters.containersindepth.ex38;

import com.exercises.chapters.containersindepth.ex29.Test;
import com.exercises.chapters.containersindepth.ex29.TestParam;
import com.exercises.chapters.containersindepth.ex29.Tester;
import com.exercises.chapters.containersindepth.ex36.SimpleHashMapArrayList;
import com.exercises.chapters.containersindepth.ex36.SimpleHashMapLinked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapPerformance {
    static List<Test<Map<Integer,Integer>>> tests = new ArrayList<>();

    static {
        tests.add(new Test<>("put") {
            public int test(Map<Integer,Integer> map, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for(int i = 0; i < loops; i++) {
                    map.clear();
                    for(int j = 0; j < size; j++)
                        map.put(j, j);
                }
                return loops * size;
            }
        });
        tests.add(new Test<>("get") {
            public int test(Map<Integer,Integer> map, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for(int i = 0; i < loops; i++)
                    for(int j = 0; j < span; j++)
                        map.get(j);
                return loops * span;
            }
        });
        tests.add(new Test<>("iterate") {
            public int test(Map<Integer,Integer> map, TestParam tp) {
                int loops = tp.loops * 10;
                for(int i = 0; i < loops; i ++) {
                    Iterator it = map.entrySet().iterator();
                    while(it.hasNext())
                        it.next();
                }
                return loops * map.size();
            }
        });
    }
    public static void main(String[] args) {
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);

        HashMap<Integer, Integer> initialMap = new HashMap<>();
        HashMap<Integer, Integer> newMap = new HashMap<>(500);
        newMap.putAll(initialMap);

        System.out.println("Initial Hash Map:");
        Tester.run(initialMap, tests);
        System.out.println("New Hash Map:");
        Tester.run(newMap, tests);
    }
}
