package org.example.ios;

import java.util.Scanner;

public class ScannerSystemInTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("姓名：");
        String name = input.nextLine();
        System.out.println("性别: ");
        char gender = input.next().charAt(0);
        System.out.println("年龄: ");
        int age = input.nextInt();

        input.close();
    }
}
