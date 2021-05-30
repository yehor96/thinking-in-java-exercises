package com.chapters.strings.ex16;

//{Args: src\main\java\com\chapters\strings\ex15 \b[Ssct]\w+}

import com.chapters.strings.ex15.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class JGrep2 {

    public static Pattern pattern;
    public static Matcher matcher;
    public static int index = 0;

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        pattern = Pattern.compile(args[1]);
        matcher = pattern.matcher("");

        String fileArg = args[0];
        if (isDirectory(fileArg)) {
            Stream.of(getFilesFromDirectory(fileArg))
                    .forEach(JGrep2::processFile);
        } else {
            processFile(new TextFile(fileArg));
        }
    }

    public static void processFile(TextFile file) {
        for (String line : file) {
            matcher.reset(line);
            while (matcher.find())
                System.out.printf("%-13s :: %d: %s: %d\n",
                        file.getFileName(), index++, matcher.group(), matcher.start());
        }
    }

    public static boolean isDirectory(String path) {
        return !path.substring(path.lastIndexOf("\\")).contains(".");
    }

    public static TextFile[] getFilesFromDirectory(String directory) {
        var files = new File(directory).listFiles();
        TextFile[] textFiles = new TextFile[files.length];
        for (int i = 0; i < textFiles.length; i++) {
            textFiles[i] = new TextFile(files[i].getPath());
        }
        return textFiles;
    }
}
