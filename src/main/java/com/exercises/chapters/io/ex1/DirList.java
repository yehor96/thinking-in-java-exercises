package com.exercises.chapters.io.ex1;

import com.exercises.chapters.containersindepth.ex4.TextFile;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

//{Args: Override}
public class DirList {
    public static final String dir = "src\\main\\java\\com\\exercises\\random\\advanture";

    public static void main(final String[] args) {
        File path = new File(dir);
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list((dir, name) -> TextFile.read(dir.getPath().concat("\\").concat(name)).contains(args[0]));
        }

        Arrays.sort(Objects.requireNonNull(list), String.CASE_INSENSITIVE_ORDER);
        Stream.of(list).forEach(System.out::println);
    }
}