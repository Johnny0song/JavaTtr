package org.example.reflection;

public class Magpie implements Bird{
    @Override
    public void jump() {
        System.out.println("Magpie jumps");
    }

    @Override
    public void fly() {
        System.out.println("Magpie flies");
    }
}
