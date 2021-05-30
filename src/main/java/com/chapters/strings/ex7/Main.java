package com.chapters.strings.ex7;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "Some text",
                "Some text.",
                "some text.",
                "Some TEXsSaSATK ASKJ ....asf.",
                "text some es..."
        );

        System.out.println("String should start with a capital letter and end with a dot:\n");
        strings.forEach(s -> {
            System.out.print("\"" + s + "\"");
            if (checkRegex(s)) {
                System.out.println(" matches!");
            } else {
                System.out.println(" does not match!");
            }
        });
    }

    public static boolean checkRegex(String value) {
        String regex = "[A-Z](.+)[.]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);

        return matcher.find();
    }
}
