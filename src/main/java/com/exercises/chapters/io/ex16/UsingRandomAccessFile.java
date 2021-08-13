package com.exercises.chapters.io.ex16;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
    static String file = "src\\main\\resources\\rtest.dat";

    static void display() throws IOException {
        try (RandomAccessFile rf = new RandomAccessFile(file, "r")) {
            System.out.println(rf.readBoolean());
            System.out.println(rf.readByte());
            System.out.println(rf.readChar());
            System.out.println(rf.readShort());
            System.out.println(rf.readLong());
            System.out.println(rf.readInt());
            System.out.println(rf.readFloat());
            System.out.println(rf.readDouble());
            System.out.println(rf.readUTF());
        }
    }

    public static void main(String[] args) {
        try (RandomAccessFile rf = new RandomAccessFile(file, "rw")) {
            rf.writeBoolean(true);
            rf.writeByte(2);
            rf.writeChar('q');
            rf.writeShort(12);
            rf.writeLong(5000000);
            rf.writeInt(12345);
            rf.writeFloat(12.5F);
            rf.writeDouble(1.414);
            rf.writeUTF("The end of the file");
            display();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}