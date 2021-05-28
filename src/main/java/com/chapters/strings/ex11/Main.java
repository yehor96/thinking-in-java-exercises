package com.chapters.strings.ex11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String value = "Arline ate eight apples and one orange while Anita hadn’t any";
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
