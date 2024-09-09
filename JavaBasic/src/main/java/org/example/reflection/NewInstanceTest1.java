package org.example.reflection;

public class NewInstanceTest1 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("org.example.reflection.Student");
        Object obj = clazz.newInstance();
        System.out.println(obj);
    }
}
