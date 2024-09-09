package org.example.reflection;

public class Huskie implements Dog{
    @Override
    public void bark() {
        System.out.println("Huskie barks");
    }

    @Override
    public void run() {
        System.out.println("Huskie runs");
    }
}
