package org.example.reflection;

import java.lang.reflect.Constructor;

public class NewInstanceTest2 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("org.example.reflection.Student");
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
            Object obj = constructor.newInstance("Alice");
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
