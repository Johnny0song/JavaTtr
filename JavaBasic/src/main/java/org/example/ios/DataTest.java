package org.example.ios;

import java.io.*;

public class DataTest {
    public static void main(String[] args) throws IOException {
//        save();
        reload();
    }



    // 写数据
    private static void save() throws IOException {
        String name = "巫师";
        int age = 300;
        char gender = '男';
        double price = 75.5;
        boolean relive = true;
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("game.dat"));
        dos.writeUTF(name);
        dos.writeInt(age);
        dos.writeChar(gender);
        dos.writeDouble(price);
        dos.writeBoolean(relive);
        dos.close();
    }

    private static void reload() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("game.dat"));
        String name = dis.readUTF();
        int age = dis.readInt();
        char gender = dis.readChar();
        double price = dis.readDouble();
        boolean relive = dis.readBoolean();

        System.out.println(name + "," + age + "," + gender + "," + price + "," + relive);
    }

}
