package org.example.ios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoDemo02 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("message.txt");
            char[] data = new char[1024];
            int len;
            while ((len = fr.read(data)) != -1){

                System.out.println(new String(data,0,len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fr!= null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
