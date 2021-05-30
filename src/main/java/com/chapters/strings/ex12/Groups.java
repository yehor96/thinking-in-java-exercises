package com.chapters.strings.ex12;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static final Set<String> words = new HashSet<>();

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)[A-Z]\\w+").matcher(POEM);
        while (m.find()) {
            words.add(m.group());
        }
        System.out.println(words);
    }
}
