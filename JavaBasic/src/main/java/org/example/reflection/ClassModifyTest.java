package org.example.reflection;

import java.lang.reflect.Modifier;

public class ClassModifyTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        int mod = stringClass.getModifiers();
        System.out.println(mod);
        System.out.println(Modifier.toString(mod));
        System.out.println(Modifier.isPublic(mod));
        System.out.println(Modifier.isFinal(mod));
        System.out.println(Modifier.isAbstract(mod));

    }
}
