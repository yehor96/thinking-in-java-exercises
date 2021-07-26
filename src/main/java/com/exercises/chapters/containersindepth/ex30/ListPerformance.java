package com.exercises.chapters.containersindepth.ex30;

import com.exercises.chapters.arrays.ex12_13.CountingGenerator;
import com.exercises.chapters.arrays.ex15.Generated;
import com.exercises.chapters.containersindepth.ex29.CountingIntegerList;
import com.exercises.chapters.containersindepth.ex29.Test;
import com.exercises.chapters.containersindepth.ex29.TestParam;
import com.exercises.chapters.containersindepth.ex29.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Vector;

public class ListPerformance {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<List<Integer>>> tests = new ArrayList<>();
    static List<Test<LinkedList<Integer>>> qTests = new ArrayList<>();

    static {
        tests.add(new Test<>("add") {
            public int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < listSize; j++)
                        list.add(j);
                }
                return loops * listSize;
            }
        });
        tests.add(new Test<>("get") {
            public int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
        tests.add(new Test<>("set") {
            public int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.set(rand.nextInt(listSize), 47);
                return loops;
            }
        });
        tests.add(new Test<>("iteradd") {
            public int test(List<Integer> list, TestParam tp) {
                final int LOOPS = 1000000;
                int half = list.size() / 2;
                ListIterator<Integer> it = list.listIterator(half);
                for (int i = 0; i < LOOPS; i++)
                    it.add(47);
                return LOOPS;
            }
        });
        tests.add(new Test<>("insert") {
            public int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                for (int i = 0; i < loops; i++)
                    list.add(5, 47); // Minimize random-access cost
                return loops;
            }
        });
        tests.add(new Test<>("remove") {
            public int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    while (list.size() > 5)
                        list.remove(5); // Minimize random-access cost
                }
                return loops * size;
            }
        });
        tests.add(new Test<>("Collections.sort()") {
            public int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    Collections.sort(list);
                }
                return loops;
            }
        });



// Tests for queue behavior:
        qTests.add(new Test<>("addFirst") {
            public int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.addFirst(47);
                }
                return loops * size;
            }
        });
        qTests.add(new Test<>("addLast") {
            public int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.addLast(47);
                }
                return loops * size;
            }
        });

        qTests.add(new Test<>("rmFirst") {
            public int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    while (list.size() > 0)
                        list.removeFirst();
                }
                return loops * size;
            }
        });

        qTests.add(new Test<>("rmLast") {
            public int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    while (list.size() > 0)
                        list.removeLast();
                }
                return loops * size;
            }
        });
    }

    static class ListTester extends Tester<List<Integer>> {
        public ListTester(List<Integer> container,
                          List<Test<List<Integer>>> tests) {
            super(container, tests);
        }

        @Override
        protected List<Integer> initialize(int size) {
            container.clear();
            container.addAll(new CountingIntegerList(size));
            return container;
        }

        // Convenience method:
        public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
            new ListTester(list, tests).timedTest();
        }

    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester<List<Integer>> arrayTest = new Tester<>(null, tests.subList(1, 3)) {
            @Override
            protected List<Integer> initialize(int size) {
                Integer[] ia = Generated.array(Integer.class, new CountingGenerator.Integer(), size);
                return Arrays.asList(ia);
            }
        };
        arrayTest.setHeadline("Array as List");
        arrayTest.timedTest();
        Tester.defaultParams = TestParam.array(10, 5000, 100, 5000, 1000, 1000, 10000, 200);
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        ListTester.run(new ArrayList<>(), tests);
        ListTester.run(new LinkedList<>(), tests);
        ListTester.run(new Vector<>(), tests);
        Tester.fieldWidth = 12;
//        Tester<LinkedList<Integer>> qTest = new Tester<>(new LinkedList<>(), qTests);
//        qTest.setHeadline("Queue tests");
//        qTest.timedTest();
    }
}