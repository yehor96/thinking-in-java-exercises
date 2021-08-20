package com.exercises.chapters.io.ex23;

import com.exercises.chapters.io.ex18.TextFile;
import lombok.SneakyThrows;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

public class ex23 {
    public static void read(CharBuffer buffer) {
        int size = buffer.remaining();
        for (int i = 0; i < size - 1; i++) {
            buffer.mark();
            System.out.print(buffer.get());
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        String fileName = "src\\main\\resources\\Small.txt";
        ByteBuffer byteBuffer = ByteBuffer.wrap(TextFile.read(fileName).getBytes(StandardCharsets.UTF_16));
        read(byteBuffer.asCharBuffer());
    }
}
