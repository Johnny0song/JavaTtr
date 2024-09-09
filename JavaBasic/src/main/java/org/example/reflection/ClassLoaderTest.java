package org.example.reflection;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader c1 = String.class.getClassLoader();
        System.out.println(c1); // null

        ClassLoader c2 = int.class.getClassLoader();
        System.out.println(c2); // null

        int[] arr = new int[10];
        ClassLoader c3 = arr.getClass().getClassLoader();
        System.out.println(c3); // null

        ClassLoader c4 = ClassLoaderTest.class.getClassLoader();
        System.out.println(c4); // sun.misc.Launcher$AppClassLoader@18b4aac2

        ClassLoaderTest [] arr2 = new ClassLoaderTest[10];
        ClassLoader c5 = arr2.getClass().getClassLoader();
        System.out.println(c5); // sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
