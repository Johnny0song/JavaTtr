package org.example.commonclass;

import java.util.Scanner;

public class StringBufferTest9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入商品名：");
        String name = input.next();
        System.out.println("请输入商品价格：");
        double price = input.nextDouble();
        String formatPrice = formatPrice(price);
        System.out.println(name+"\t" + formatPrice);
    }

    private static String formatPrice(double price) {
        // 1.将double类型转换成stringbuffer
        StringBuffer buffer = new StringBuffer(String.valueOf(price));
        // 2.在指定的位置插入逗号
        int index = buffer.lastIndexOf(".");
        for(int i = index - 3; i >0 ; i -=3){
            buffer.insert(i, ",");
        }
        return buffer.toString();
    }
}
