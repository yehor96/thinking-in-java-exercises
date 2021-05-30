package com.chapters.strings.ex13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.chapters.strings.ex12.Groups.POEM;

public class StartEnd {
    public static String input = POEM;

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            d.display("find() ‘" + m.group() + "‘ start = " + m.start() + " end = " + m.end());
        if (m.lookingAt()) // No reset() necessary
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());
        if (m.matches()) // No reset() necessary
            d.display("matches() start = " + m.start() + " end = " + m.end());
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            if (in.isBlank()) {
                continue;
            }
            System.out.println("input : " + in);
            for (String regex : new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "Did.*?.", "Beware"})
                examine(in, regex);
        }
    }
}
