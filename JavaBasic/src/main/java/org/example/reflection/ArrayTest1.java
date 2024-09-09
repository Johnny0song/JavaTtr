package org.example.reflection;

import jdk.nashorn.internal.codegen.types.ArrayType;

import java.lang.reflect.Array;

public class ArrayTest1 {
    public static void main(String[] args) {
        Object arr = Array.newInstance(String.class, 5);
        Array.set(arr, 0, "Hello");
        Array.set(arr, 1, "World");

        System.out.println(Array.get(arr, 0));
        System.out.println(Array.get(arr, 1));
        System.out.println(Array.get(arr, 2));
    }
}
