package org.example.reflection;

public class DogProxyTest {
    public static void main(String[] args) {
        Dog dog = new TibetanMastiff();
        DogProxy dogProxy = new DogProxy(dog);
        dogProxy.bark();
        dogProxy.run();

        dog = new Huskie();
        dogProxy.setDog(dog);
        dogProxy.bark();
        dogProxy.run();
    }
}
