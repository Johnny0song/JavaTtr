package com.nienjuc.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) {
        FutureTask<String> stringFutureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello FutureTask";
            }
        });
        Thread thread = new Thread(stringFutureTask);
        thread.start();
        try {
            String result = stringFutureTask.get();
            System.out.println("Result from FutureTask: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
