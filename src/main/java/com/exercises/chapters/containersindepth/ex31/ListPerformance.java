package com.exercises.chapters.containersindepth.ex31;

import com.exercises.chapters.containersindepth.ex29.CountingStringList;
import com.exercises.chapters.containersindepth.ex29.Test;
import com.exercises.chapters.containersindepth.ex29.TestParam;
import com.exercises.chapters.containersindepth.ex29.Tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListPerformance {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<List<String>>> tests = new ArrayList<>();

    static {
        tests.add(new Test<>("add") {
            protected int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < listSize; j++)
                        list.add(String.valueOf(j));
                }
                return loops * listSize;
            }
        });
        tests.add(new Test<>("get") {
            protected int test(List<String> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
        tests.add(new Test<>("remove") {
            protected int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingStringList(size));
                    while (list.size() > 5)
                        list.remove(5); // Minimize random-access cost
                }
                return loops * size;
            }
        });
    }

    static class ListTester extends Tester<List<String>> {
        public ListTester(List<String> container,
                          List<Test<List<String>>> tests) {
            super(container, tests);
        }

        @Override
        protected List<String> initialize(int size) {
            container.clear();
            container.addAll(new CountingStringList(size));
            return container;
        }

        // Convenience method:
        public static void run(List<String> list, List<Test<List<String>>> tests) {
            new ListTester(list, tests).timedTest();
        }

    }

    public static void main(String[] args) {
        Tester.defaultParams = TestParam.array(10, 5000, 100, 5000, 1000, 1000, 200);
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        ListTester.run(new ArrayList<>(), tests);
        ListTester.run(new LinkedList<>(), tests);
        ListTester.run(new StringContainer(), tests);
        Tester.fieldWidth = 12;
    }
}