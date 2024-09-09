package org.example.reflection;

public class ClassNameTest {
    public static void main(String[] args) {
        System.out.println(String.class.getName());
        System.out.println(int.class.getName());
        System.out.println(void.class.getName());
        System.out.println(int[].class.getName());
        System.out.println(int[][].class.getName());
        System.out.println(ClassNameTest.class.getName());
        System.out.println(Object[].class.getName());
    }
}
