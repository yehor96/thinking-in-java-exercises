package com.random.applyprocessor;

import java.util.stream.Stream;

public class SwapPair implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        System.out.println("Entry = " + input.toString());
        System.out.print("Result = ");
        return swap((String) input);
    }

    public String swap(String argument) {
        int unprocessedChar = 0;
        if (!isDividedBy2(argument)) {
            unprocessedChar += 1;
        }

        var array = argument.toCharArray();
        for (int i = 0; i < array.length - unprocessedChar; i += 2) {
            var temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        return getCleanString(array);
    }

    public boolean isDividedBy2(String value) {
        return value.length() % 2 == 0;
    }

    public String getCleanString(char[] array) {
        StringBuilder builder = new StringBuilder();
        Stream.of(array).forEach(builder::append);
        return builder.toString();
    }
}
