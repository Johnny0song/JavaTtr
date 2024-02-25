package org.example.commonclass;

public class EqualsTest {
    public static void main(String[] args) {
        Person alice1 = new Person("Alice", 18);
        Person alice2 = new Person("Alice", 18);
        System.out.println(alice1.equals(alice2));
    }
}
