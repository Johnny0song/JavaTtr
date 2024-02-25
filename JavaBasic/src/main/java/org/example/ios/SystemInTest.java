package org.example.ios;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SystemInTest {
    public static void main(String[] args) {
        Scanner input = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("message.txt");
          // 重定向从文件输入
          System.setIn(fis);
          input = new Scanner(System.in);
          while (input.hasNext()){
              String str = input.nextLine();
              System.out.println(str);
          }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(input != null){
                input.close();
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    // 重定向回键盘输入
                    System.setIn(new FileInputStream(FileDescriptor.in));
                }
            }
        }
    }
}
