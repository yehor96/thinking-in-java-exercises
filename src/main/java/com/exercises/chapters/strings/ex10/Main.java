package com.exercises.chapters.strings.ex10;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String value = "Java now has regular expressions";
        List<String> regexes = List.of(
                "^Java",
                "\\Breg.*",
                "n.w\\s+h(a|i)s",
                "s?", "s*",
                "s+", "s{4}",
                "S{1}.",
                "s{0,3}");

        System.out.println("String: \"" + value + "\"");
        regexes.forEach(r -> {
            Pattern p = Pattern.compile(r);
            Matcher m = p.matcher(value);
            if (m.find()) {
                System.out.println("\nFound match using regex \"" + r + "\"\nResult:");
                System.out.print("\"" + m.group() + "\" ");
                while(m.find()) {
                    System.out.print("\"" + m.group() + "\" ");
                }
            } else {
                System.out.print("\nDid not find match using regex \"" + r + "\"");
            }
        });
    }
}
