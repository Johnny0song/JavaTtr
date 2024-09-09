package org.example.reflection;

public class InterfaceTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Class<?>[] interfaces = stringClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }
}
