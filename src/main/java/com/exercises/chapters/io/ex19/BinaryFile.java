package com.exercises.chapters.io.ex19;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {
    public static byte[] read(File bFile) throws IOException {
        try (BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile))) {
            byte[] data = new byte[bf.available()];
            bf.read(data);
            return data;
        }
    }

    public static byte[] read(String bFile) throws IOException {
        return read(new File(bFile).getAbsoluteFile());
    }
}
