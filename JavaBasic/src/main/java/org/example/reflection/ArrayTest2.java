package org.example.reflection;

import java.lang.reflect.Array;

public class ArrayTest2 {
    public static <T> T[] copyOf(T[] original, int newLength) {
       if(newLength < 0) {
           throw new NegativeArraySizeException("new length " + newLength);
       }
        Class<? extends Object[]> originalClass = original.getClass();
        Class<?> componentType = originalClass.getComponentType();
        Object o = Array.newInstance(componentType, newLength);
        T[] newArr = (T[]) o;
        for (int i = 0; i < Math.min(original.length, newLength); i++) {
            newArr[i] = original[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry"};
        String[] newArr = copyOf(arr, 2);
        for (String s : newArr) {
            System.out.println(s);
        }
    }
}














