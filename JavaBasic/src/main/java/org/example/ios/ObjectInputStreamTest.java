package org.example.ios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {

            ois = new ObjectInputStream(new FileInputStream("account.dat"));
            Object readObject = ois.readObject();
            System.out.println(readObject);
            System.out.println(Account.getInterestRate());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
