package org.example.threads;

public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
        new Thread(myRunnable).start();
        for(int i = 5; i >= 1; i--){
            System.out.println(Thread.currentThread().getName() + "线程；" + i);
        }
    }
}
class MyRunnable implements Runnable{
    // 实现Runnable接口的run方法
    @Override
    public void run() {
        for(int i = 5; i >= 1; i--){
            System.out.println(Thread.currentThread().getName() + "线程；" + i);
        }

    }
}