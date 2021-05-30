package com.chapters.strings.ex15;

//{Args: src\main\java\com\chapters\strings\ex15\JGrep.java \b[Ssct]\w+ 2}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        @SuppressWarnings("MagicConstant") //third argument passed as a flag
        Pattern p = Pattern.compile(args[1], Integer.parseInt(args[2]));

        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }
}
