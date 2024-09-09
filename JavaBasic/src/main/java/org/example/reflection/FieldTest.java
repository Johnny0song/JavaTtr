package org.example.reflection;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Chinese.class;
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        Object obj = clazz.newInstance();
        nameField.set(obj, "Alice");
        System.out.println(nameField.get(obj));

        Field countryField = clazz.getDeclaredField("country");
        countryField.setAccessible(true);
        countryField.set(null, "China");
        System.out.println(countryField.get(null));

    }
}
