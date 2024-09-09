package org.example.reflection;

public class DogProxy implements Dog{
    private Dog dog;

    public DogProxy(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void bark() {
        System.out.println("DogProxy is barking");
        dog.bark();
        System.out.println("DogProxy finished barking");
    }

    @Override
    public void run() {
        System.out.println("DogProxy is running");
        dog.run();
        System.out.println("DogProxy finished running");
    }
}
