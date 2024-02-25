package org.example.ios;

import java.io.*;

public class IoDemo06 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        OutputStreamWriter outputStreamWriter = null;
        byte[] data = new byte[1024];
        int i ;
        try {
            bis= new BufferedInputStream(new FileInputStream("JavaBasic/src/main/resources/text.txt"));

            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("JavaBasic/src/main/resources/text_gbk.txt"), "GBK");
            while ((i = bis.read(data)) != -1){
                System.out.println(new String(data,0,i));
                outputStreamWriter.write(new String(data,0,i, "GBK"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (outputStreamWriter != null) {
                    outputStreamWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
