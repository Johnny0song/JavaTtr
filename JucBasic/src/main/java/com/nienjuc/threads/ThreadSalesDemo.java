package com.nienjuc.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSalesDemo {

    private static final    int GOODMAXCOUNT= 5;
    static class StoreSale extends  Thread{

        private int goodCount = GOODMAXCOUNT;
        @Override
        public void run() {
            for (int i= 0; i <= GOODMAXCOUNT; i ++ ) {

                if(goodCount > 0){
                    System.out.println("store Sold item by " + Thread.currentThread().getName()
                            + " soled 1 件 " +"remaining item number " + --goodCount);
                }
            }
        }
    }

    static class MallSale implements Runnable{
        private AtomicInteger  goodCount = new AtomicInteger(GOODMAXCOUNT);

//        private int goodCount = GOODMAXCOUNT;
        @Override
        public void run() {
            for (int i= 0; i <= GOODMAXCOUNT; i ++ ) {

                if(goodCount.get() > 0){

                    System.out.println("mall Sold item by " + Thread.currentThread().getName()
                            + " soled 1 件 " +"remaining item number " + goodCount.decrementAndGet());
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            StoreSale storeSale = new StoreSale();
            storeSale.setName("Store-" + i);
            storeSale.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        MallSale mallSale = new MallSale();
        for (int i = 1; i <= 3; i++) {
            Thread mallThread = new Thread(mallSale);
            mallThread.setName("Mall-" + i);
            mallThread.start();
        }
    }
}
