package org.example.reflection;

public class TibetanMastiff implements Dog{
    @Override
    public void bark() {
        System.out.println("Tibetan Mastiff barks");
    }

    @Override
    public void run() {
        System.out.println("Tibetan Mastiff runs");
    }
}
