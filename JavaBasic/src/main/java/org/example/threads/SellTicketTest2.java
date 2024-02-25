package org.example.threads;

public class SellTicketTest2 {
    public static void main(String[] args) throws InterruptedException {
        SellTicketRunnable st = new SellTicketRunnable();
        Thread thread = new Thread(st);
        thread.start();
        new Thread(st).start();
        new Thread(st).start();
        new Thread(st).start();

    }
}

class SellTicketRunnable implements Runnable{
    private  int tickets = 100; // 票数

    @Override
    public void run() {
        while (true){
            if(tickets <= 0){
                System.out.println("票已经售完");
                break;
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票，目前票数： " + (--tickets));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

