package org.example.commonclass;

import java.util.Arrays;

public class ArraysSortTest2 {
    public static void main(String[] args) {
        Person [] pers = {
                new Person("lily", 23),
                new Person("lucy", 5),
                new Person("bob", 20),
                new Person("rose", 18)
        };
        Arrays.sort(pers);
        System.out.println(Arrays.toString(pers));

        for (Person per : pers) {
            System.out.println(per);
        }
    }
}
