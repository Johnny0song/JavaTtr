package org.example.ios;

import java.io.*;

public class DecodeTest {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(
                   new InputStreamReader(
                           new FileInputStream("JavaBasic/src/main/resources/text_gbk.txt"), "GBK"
                   )
           );
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
