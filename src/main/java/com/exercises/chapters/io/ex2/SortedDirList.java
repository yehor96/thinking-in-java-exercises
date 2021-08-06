package com.exercises.chapters.io.ex2;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SortedDirList {

    private File[] files;

    public SortedDirList(File dir) {
        files = dir.listFiles();
        Arrays.sort(Objects.requireNonNull(files));
    }

    public File[] list() {
        return files;
    }

    public File[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        return Stream.of(files)
                .filter(f -> pattern.matcher(f.getName()).find())
                .toArray(File[]::new);
    }
}
