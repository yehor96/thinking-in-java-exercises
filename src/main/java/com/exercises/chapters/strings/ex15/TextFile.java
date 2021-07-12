package com.exercises.chapters.strings.ex15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TextFile implements Iterable<String> {
    String fileName;
    File file;
    List<String> content = new ArrayList<>();

    public TextFile(String path) {
        file = new File(path);
        fileName = file.getName();
        try (Scanner myReader = new Scanner(file)) {
            while (myReader.hasNext()) {
                content.add(myReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found. " + e.getMessage());
        }
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public Iterator<String> iterator() {
        return content.iterator();
    }
}
