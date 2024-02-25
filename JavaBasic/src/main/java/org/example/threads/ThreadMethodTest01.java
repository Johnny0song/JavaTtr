package org.example.threads;

public class ThreadMethodTest01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 2; i <= 100; i += 2){
                    System.out.println("偶数线程：" + i);
                }
            }
        }).start();

        new Thread(){
            @Override
            public void run() {
                for(int i = 1; i <= 100; i +=2 ){
                    System.out.println("奇数线程：" + i);
                }
            }
        }.start();
    }
}
