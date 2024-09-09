package org.example.oodadvancedprogramming;

import java.util.Scanner;

public class WeekTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int value = scanner.nextInt();
        Week week = Week.getByValue(value);
        if(week != null) {
            System.out.println(week.name());
            System.out.println(week.ordinal());
        }
        switch (week) {
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
