package org.example.reflection;

import java.util.Map;

public class InnerOuterClassTest {
    public static void main(String[] args) {
        Class<?> clazz = Map.class;
        Class<?>[] declaredClasses = clazz.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {
            System.out.println(declaredClass);
        }

        Class<?>[] classes = clazz.getClasses();
        for (Class<?> aClass : classes) {
            System.out.println(aClass);
        }

        Class<?> ec = Map.Entry.class;
        Class<?> declaringClass = ec.getDeclaringClass();
        System.out.println(declaringClass);

    }
}
