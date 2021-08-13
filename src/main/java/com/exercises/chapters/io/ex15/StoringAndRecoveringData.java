package com.exercises.chapters.io.ex15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringAndRecoveringData {
    public static void main(String[] args) {
        String file = "src\\main\\resources\\Data.txt";

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            out.writeBoolean(true);
            out.writeByte(2);
            out.writeChar('q');
            out.writeShort(12);
            out.writeLong(5000000);
            out.writeInt(12345);
            out.writeFloat(12.5F);
            out.writeDouble(3.14159);
            out.writeUTF("That was pi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            System.out.println(in.readBoolean());
            System.out.println(in.readByte());
            System.out.println(in.readChar());
            System.out.println(in.readShort());
            System.out.println(in.readLong());
            System.out.println(in.readInt());
            System.out.println(in.readFloat());
            System.out.println(in.readDouble());
            System.out.println(in.readUTF());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}