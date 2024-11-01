package org.example.threads;

public class SimpleDaemon implements Runnable{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Thread daemon = new Thread(new SimpleDaemon());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        try {
            Thread.sleep(175);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
