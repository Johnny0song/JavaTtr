package org.example.threads;


public class ThreadMethodTest02 {
    public static void main(String[] args) throws InterruptedException {
        SellTicketRunnable runnable = new SellTicketRunnable();
        Thread t1 = new Thread(runnable, "普通窗口");
        Thread t2 = new Thread(runnable, "紧急窗口");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        t1.start();
        t2.start();


    }
}
