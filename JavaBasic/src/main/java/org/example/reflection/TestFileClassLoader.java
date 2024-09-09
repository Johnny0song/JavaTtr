package org.example.reflection;

import java.lang.reflect.Modifier;

public class TestFileClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        FileClassLoader fsc = new FileClassLoader("D:\\IdeaProjects\\JavaTtr\\JavaBasic\\target\\classes");
        Class<?> uc = fsc.loadClass("org.example.oodadvancedprogramming.Week");
        System.out.println(uc);
        System.out.println(uc.getClassLoader());

        System.out.println(uc.getPackage().getName());
        int modifiers = uc.getModifiers();
        System.out.println(Modifier.toString(modifiers));

        Class<?> sc = fsc.loadClass("java.lang.String");
        System.out.println(sc);
        System.out.println(sc.getClassLoader());
    }
}
