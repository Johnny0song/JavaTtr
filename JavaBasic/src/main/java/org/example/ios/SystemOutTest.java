package org.example.ios;

import java.io.*;

public class SystemOutTest {
    public static void main(String[] args) {
        System.out.println("start");
        PrintStream printStream = null;
        try {
            printStream = new PrintStream("systemout.txt");
            System.setOut(printStream);
            System.out.println("hello");
            System.out.println("java");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(printStream != null){
                printStream.close();
            }
            // 重定向回控制台
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        }

        System.out.println("end");
    }
}
