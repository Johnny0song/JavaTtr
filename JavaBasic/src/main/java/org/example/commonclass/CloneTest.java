package org.example.commonclass;

public class CloneTest {
    public static void main(String[] args) {
        Person person = new Person("谷姐", 18);

        try {
            Object clone = person.clone();
            System.out.println(person.hashCode());
            System.out.println(System.identityHashCode(person));
            System.out.println(clone.hashCode());
            System.out.println(System.identityHashCode(clone));
            System.out.println(person == clone);
            System.out.println(person.equals(clone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
