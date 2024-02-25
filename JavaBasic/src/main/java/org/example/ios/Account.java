package org.example.ios;

import java.io.Serializable;

public class Account implements Serializable {
    private  static  final long serialVersionUID = 1L; // 序列化版本ID(唯一标识)
    private  static double interestRate;
    private  String number;
    private String name;
    private transient String password;
    private double balance;

    private int age;
    public Account(){};

    public Account(String number, String name, String password, double balance) {
        super();
        this.number = number;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }


    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
