package org.example.ios;

import java.io.*;

public class FileCopyGBK {
    public static void main(String[] args) {
        String sourceFilePath = "JavaBasic/src/main/resources/text.txt";
        String destinationFilePath = "JavaBasic/src/main/resources/text_gbk.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(sourceFilePath), "UTF-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                     new FileOutputStream(destinationFilePath), "GBK"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // 写入换行符
            }
            System.out.println("文件复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

