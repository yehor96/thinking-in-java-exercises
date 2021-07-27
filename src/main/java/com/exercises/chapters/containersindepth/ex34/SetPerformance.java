package com.exercises.chapters.containersindepth.ex34;

import com.exercises.chapters.containersindepth.ex29.Test;
import com.exercises.chapters.containersindepth.ex29.TestParam;
import com.exercises.chapters.containersindepth.ex29.Tester;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetPerformance {
    static List<Test<Set<String>>> tests = new ArrayList<>();

    static {
        tests.add(new Test<>("add") {
            public int test(Set<String> set, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    set.clear();
                    for (int j = 0; j < size; j++)
                        set.add(String.valueOf(j));
                }
                return loops * size;
            }
        });
        tests.add(new Test<>("contains") {
            public int test(Set<String> set, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for (int i = 0; i < loops; i++)
                    for (int j = 0; j < span; j++)
                        set.contains(String.valueOf(j));
                return loops * span;
            }
        });
        tests.add(new Test<>("iterate") {
            public int test(Set<String> set, TestParam tp) {
                int loops = tp.loops * 10;
                for (int i = 0; i < loops; i++) {
                    Iterator<String> it = set.iterator();
                    while (it.hasNext())
                        it.next();
                }
                return loops * set.size();
            }
        });
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.fieldWidth = 10;
        Tester.run(new TreeSet<>(), tests);
        Tester.run(new HashSet<>(), tests);
        Tester.run(new LinkedHashSet<>(), tests);
    }
}