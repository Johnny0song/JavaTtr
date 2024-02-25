package org.example.commonclass;

import java.util.Arrays;

public class ArraysEqualsTest {
    public static void main(String[] args) {
        Person [] pers1 = {
                new Person("lily", 23),
                new Person("lucy", 5),
                new Person("bob", 20),
                new Person("rose", 18)
        };

        Person [] pers2 = {
                new Person("lily", 23),
                new Person("lucy", 5),
                new Person("bob", 20),
                new Person("rose", 18)
        };

        System.out.println(Arrays.equals(pers1,pers2));
    }
}
