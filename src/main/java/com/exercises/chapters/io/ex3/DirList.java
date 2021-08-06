package com.exercises.chapters.io.ex3;

import com.exercises.chapters.containersindepth.ex4.TextFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.stream.Stream;

//{Args: Override}
public class DirList {
    public static final String dir = "src\\main\\java\\com\\exercises\\random\\advanture";

    public static void main(final String[] args) {
        File path = new File(dir);
        long sizeOfFiles;
        if (args.length == 0) {
            throw new IllegalArgumentException("Please pass an argument to the program");
        } else {
            sizeOfFiles = Stream.of(Objects.requireNonNull(path.list(
                    (dir, name) -> TextFile.read(dir.getPath().concat("\\").concat(name)).contains(args[0]))))
                    .mapToLong(name -> {
                        try {
                            return Files.size(Path.of(dir.concat("\\").concat(name)));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .sum();
        }

        System.out.println(sizeOfFiles);
    }
}