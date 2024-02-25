package org.example.ios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutPutStreamTest {
    public static void main(String[] args) {
        Account.setInterestRate(0.0024);
        Account account = new Account("111000111", "尚硅谷", "123456", 1000.0);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("account.dat"));
            oos.writeObject(account);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
