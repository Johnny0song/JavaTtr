package org.example.commonclass;

public class TImeConsumeTest {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;

        startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("");
        for(int i = 0; i < 20000; i++){
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间: " + (endTime - startTime) );


        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("");
        for(int i = 0; i < 20000; i++){
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间: " + (endTime - startTime) );


        startTime = System.currentTimeMillis();
        String text = "";
        for(int i = 0; i < 20000; i++){
            text += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间: " + (endTime - startTime) );

    }
}
