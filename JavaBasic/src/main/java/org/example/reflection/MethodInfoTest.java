package org.example.reflection;

import java.lang.reflect.Method;

public class MethodInfoTest {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
