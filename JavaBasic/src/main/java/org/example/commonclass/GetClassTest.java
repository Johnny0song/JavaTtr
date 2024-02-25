package org.example.commonclass;

public class GetClassTest {
    public static void main(String[] args) {
        listen(new Dog());
        listen(new Cat());
    }

    public static  void listen(Animal animal){
        System.out.println("The animal is a " + animal.getClass());
        animal.shut();
    }
}

abstract class Animal{
    public abstract  void shut();
}

class Dog extends Animal{
    @Override
    public void shut() {
        System.out.println("汪汪汪...");
    }
}

class Cat extends Animal{
    @Override
    public void shut() {
        System.out.println("喵喵喵...");
    }
}