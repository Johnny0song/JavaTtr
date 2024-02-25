package org.example.threads;


public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();
        for(int i = 5; i >= 1; i--){
            System.out.println(Thread.currentThread().getName() + "线程；" + i);
        }

    }
}


class MyThread extends Thread{

    // 重写Thread类的run方法
    @Override
    public void run() {
        super.run();
        for(int i = 1; i <= 5; i++){
            System.out.println(getName() + "线程: " + i);
        }
    }
}







