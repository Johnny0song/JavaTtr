package org.example.ios;

import java.io.*;

public class IoDemo04 {
    public static void main(String[] args) {
        try {
            copyFile(new File("JavaBasic/src/main/resources/1.jpg"),
                    new File("JavaBasic/1.jpg"));
            System.out.println("文件复制成功");
        }catch (IOException e){
            System.out.println("文件复制失败");
        }
    }

    private static void copyFile(File src, File dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        try {
            byte[] data = new byte[1024];
            int len;
            while ((len = fis.read(data)) != -1){
                fos.write(data, 0, len);
            }
        }finally {
            try {
                if(fis != null){
                    fis.close();
                }
            }finally {
                if(fos != null){
                    fos.close();
                }
            }
        }


    }
}
