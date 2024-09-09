package org.example.reflection;

public class Chinese implements Person{
    private static String country;
    public String name;

    @Override
    public void study() {
        System.out.println("Chinese is studying");
    }

    @Override
    public void think() {
        System.out.println("Chinese is thinking");
    }
}
