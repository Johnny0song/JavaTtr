package org.example.commonclass;

public class InsertReplaceDeleteTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("尚硅谷棒");
        buffer.insert(3,"非常");
        System.out.println(buffer);
        buffer.replace(3,5, "确实");
        System.out.println(buffer);
        buffer.delete(3,5);
        System.out.println(buffer);
    }
}
