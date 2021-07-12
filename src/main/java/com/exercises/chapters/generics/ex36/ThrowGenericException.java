package com.exercises.chapters.generics.ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface Processor<T, E extends Exception, O extends Exception> {
    void process(List<T> resultCollector) throws E, O;
}

class ProcessRunner<T, E extends Exception, O extends Exception> extends ArrayList<Processor<T, E, O>> {
    List<T> processAll() throws E, O {
        List<T> resultCollector = new ArrayList<>();
        for (Processor<T, E, O> processor : this)
            processor.process(resultCollector);
        return resultCollector;
    }
}

class Failure1 extends Exception {
    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }
}

class Processor1 implements Processor<String, Failure1, Failure2> {
    static int count = 3;

    public void process(List<String> resultCollector) throws Failure1, Failure2 {
        if (count-- > 1)
            resultCollector.add("Hep!");
        else
            resultCollector.add("Ho!");
        if (count < 0) {
            if (new Random().nextBoolean()) {
                throw new Failure1();
            } else {
                throw new Failure2();
            }
        }
    }
}

class Failure2 extends Exception {
    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }
}

class Processor2 implements Processor<Integer, Failure1, Failure2> {
    static int count = 2;

    public void process(List<Integer> resultCollector) throws Failure1, Failure2 {
        if (count-- == 0)
            resultCollector.add(47);
        else {
            resultCollector.add(11);
        }
        if (count < 0) {
            if (new Random().nextBoolean()) {
                throw new Failure1();
            } else {
                throw new Failure2();
            }
        }
    }
}

public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String, Failure1, Failure2> runner = new ProcessRunner<>();
        for (int i = 0; i < 3; i++)
            runner.add(new Processor1());
        try {
            System.out.println(runner.processAll());
        } catch (Failure1 | Failure2 e) {
            System.out.println(e);
        }
        ProcessRunner<Integer, Failure1, Failure2> runner2 = new ProcessRunner<>();
        for (int i = 0; i < 3; i++)
            runner2.add(new Processor2());
        try {
            System.out.println(runner2.processAll());
        } catch (Failure2 | Failure1 e) {
            System.out.println(e);
        }
    }
}