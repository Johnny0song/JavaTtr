package org.example.ios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileWriter fw = null;
        try {
            fw = new FileWriter("message.txt", true);
            while (true){
                System.out.println("请输入留言（stop 结束）");
                String message = input.nextLine();
                if("stop".equals(message)){
                    break;
                }
                fw.write(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(input != null){
                input.close();
            }
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
