package com.exercises.chapters.io.ex4_5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ProcessFilesNew {
    public interface Strategy {
        void process(File file);
    }

    private final Strategy strategy;
    private String regex;
    private int sizeCounter;

    public ProcessFilesNew(Strategy strategy, String regex) {
        this.regex = regex;
        this.strategy = strategy;
        sizeCounter = 0;
    }

    public void start(String[] args) {
        try {
            if (args.length == 0)
                processDirectoryTree(new File("."));
            else
                for (String arg : args) {
                    File fileArg = new File(arg);
                    if (fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else {
                        strategy.process(new File(arg).getCanonicalFile());
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void processDirectoryTree(File root) throws IOException {
        for (File file : Directory.walk(root.getAbsolutePath(), regex))
            strategy.process(file.getCanonicalFile());
    }

    public static void main(String[] args) {
        long[] size = new long[1];

        new ProcessFilesNew(file -> {
            size[0] += FileUtils.sizeOf(file);
            System.out.println(file);
        }, "Main.java").start(args);
        System.out.println("Total size of these files: " + size[0] + " bytes.");
    }
}