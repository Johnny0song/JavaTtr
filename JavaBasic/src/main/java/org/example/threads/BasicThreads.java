package org.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            new Thread(new LiftOff()).start();

            System.out.println("Waiting for LiftOff");
        }


    }
}
