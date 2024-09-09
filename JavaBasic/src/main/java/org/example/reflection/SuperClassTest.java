package org.example.reflection;

public class SuperClassTest {
    public static void main(String[] args) {
        System.out.println(Integer.class.getSuperclass());
        System.out.println(int.class.getSuperclass());
        System.out.println(int[].class.getSuperclass());
        System.out.println(String[].class.getSuperclass());
        System.out.println(Object.class.getSuperclass());
    }
}
