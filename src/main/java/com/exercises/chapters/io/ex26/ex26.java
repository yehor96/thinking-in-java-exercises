package com.exercises.chapters.io.ex26;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex26 {

    public static void readWords(String fileName) {
        CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
        try (FileChannel channel = new FileInputStream(fileName).getChannel()) {
            ByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            CharBuffer charBuffer = decoder.decode(buffer);
            regexLogic(charBuffer.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void regexLogic(String content) {
        @SuppressWarnings("MagicConstant") //third argument passed as a flag
                Pattern p = Pattern.compile("\\b[Ssct]\\w+", 2);

        int index = 0;
        Matcher m = p.matcher("");
        for (String line : content.split("\n")) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }

    public static void main(String[] args) {
        readWords("src\\main\\resources\\Lines.txt");
    }
}
