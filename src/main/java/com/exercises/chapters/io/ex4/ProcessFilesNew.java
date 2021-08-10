package com.exercises.chapters.io.ex4;

import java.io.File;
import java.io.IOException;

public class ProcessFilesNew {
    public interface Strategy {
        void process(File file);
    }

    private final Strategy strategy;
    private String regex;

    public ProcessFilesNew(Strategy strategy, String regex) {
        this.regex = regex;
        this.strategy = strategy;
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
        new ProcessFilesNew(System.out::println, "pom.*").start(args);
    }
}