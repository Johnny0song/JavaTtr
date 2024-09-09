package org.example.sets;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ListDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        // 初始延迟3分钟，然后每5分钟执行一次
        executor.scheduleAtFixedRate(() -> {
            // 这里放置你需要执行的任务逻辑
            System.out.println("任务执行时间: " + sdf.format(System.currentTimeMillis()));
        }, 0, 5, TimeUnit.SECONDS);


    }
}
