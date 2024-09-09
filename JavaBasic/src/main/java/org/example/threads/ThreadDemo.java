package org.example.threads;


import org.junit.Test;

public class ThreadDemo {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        Thread t1 = new Thread(printNum);
        Thread t2 = new Thread(printNum);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }

}


class PrintNum implements Runnable {
    private int num = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    notify();
                    if (num <= 100) {
                        System.out.println(Thread.currentThread().getName() + ":" + num);
                        num++;
                        wait();
                    } else {
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
















