package org.example.commonclass;

public class AppendTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello");
        buffer.append("尚硅谷").append(99.9).append(true).append('棒').append(100);
        System.out.println(buffer);
    }
}
