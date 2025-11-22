package com.nienjuc.threads;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<?> submit = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1 is running");
            }
        },"Task 1 result");

        Future<String> submit1 = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 2 result";
            }
        });



        try {
            System.out.println("Result of Task 1: " + submit.get());
            System.out.println("Result of Task 2: " + submit1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }


        executorService.shutdown();

    }
}
