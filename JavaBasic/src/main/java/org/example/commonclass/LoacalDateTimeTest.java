package org.example.commonclass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoacalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(now);
        System.out.println(dateTimeFormatter.format(now));
    }
}
