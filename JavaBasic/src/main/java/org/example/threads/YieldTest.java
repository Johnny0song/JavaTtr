package org.example.threads;

public class YieldTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    Thread.yield();
                }
            }
        };

        Thread thread1 = new Thread(runnable, "高");
        thread1.setPriority(Thread.MAX_PRIORITY);
        Thread thread2 = new Thread(runnable, "低");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
