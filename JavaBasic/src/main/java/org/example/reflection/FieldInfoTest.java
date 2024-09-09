package org.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldInfoTest {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            int modifiers = declaredField.getModifiers();
            Class<?> type = declaredField.getType();
            String name = declaredField.getName();
            System.out.println(Modifier.toString(modifiers ) + " " + type + " " + name);
        }
    }
}
