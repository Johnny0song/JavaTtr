package org.example.ios;

import java.io.*;

public class IoDemo05 {
    public static void main(String[] args) {
        try {
            copyFileHighSpeed(new File("E:\\BaiduNetdiskDownload\\阿里大数据之路_笔记版本.pdf"),
                    new File("阿里大数据之路_笔记版本.pdf"));
            System.out.println("文件复制成功");
        }catch (IOException e){
            System.out.println("文件复制失败");
        }
    }

    private static void copyFileHighSpeed(File src, File dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        try {
            byte[] data = new byte[1024];
            int len;
            while ((len = bis.read(data)) != -1){
                bos.write(data, 0, len);
            }
        }finally {
            try {
                if(bis != null){
                    bis.close();
                }
            }finally {
                if(bos != null){
                    bos.close();
                }
            }
        }


    }
}
