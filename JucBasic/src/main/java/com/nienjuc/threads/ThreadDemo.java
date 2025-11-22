package com.nienjuc.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable running");
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        new Thread(() ->{
                System.out.println("Lambda Runnable running");
                System.out.println(Thread.currentThread().getName());
            }
        ).start();
    }

    public static class  MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("MyThread running");
            System.out.println(getName());
        }
    }


}
