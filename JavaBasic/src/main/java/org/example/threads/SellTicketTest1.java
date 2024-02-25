package org.example.threads;

public class SellTicketTest1 {
    public static void main(String[] args) {
        SellTicketThread s1 = new SellTicketThread();
        SellTicketThread s2 = new SellTicketThread();
        SellTicketThread s3 = new SellTicketThread();
        s1.start();
        s2.start();
        s3.start();
    }
}


class SellTicketThread extends Thread{
    private  int tickets = 100; // 票数

    @Override
    public void run() {
        super.run();
        while (true){
            if(tickets <= 0){
                System.out.println("票已经售完");
                break;
            }
            System.out.println(getName() + "卖了一张票，目前票数： " + (--tickets));
        }
    }
}