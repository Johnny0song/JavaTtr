package org.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ConstructorInfoTest {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            int mod = constructor.getModifiers();
            String name = constructor.getName();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            System.out.println(Modifier.toString(mod) + "\t" + name + "("+Arrays.toString(parameterTypes)
                    .replace("[","").replace("]","") + ")");
        }
    }
}
