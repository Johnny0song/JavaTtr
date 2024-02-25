package org.example.threads;

public class DaemonTest {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("我是MyDaemon,我默默守护你，只为你存在。");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
        for(int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() +":"+ i );
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
