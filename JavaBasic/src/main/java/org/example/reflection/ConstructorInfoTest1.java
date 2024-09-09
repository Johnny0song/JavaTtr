package org.example.reflection;

import java.lang.reflect.Constructor;

public class ConstructorInfoTest1 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Outer> clazz = Outer.class;
        // 获取所有的构造器
        Constructor<Outer> constructor = clazz.getDeclaredConstructor();
        System.out.println(constructor);

        Class<?> c = Outer.Inner1.class;
        Constructor<?> cs = c.getDeclaredConstructor(Outer.class);
        System.out.println(cs);

        Class<?> c2 = Outer.Inner2.class;
        Constructor<?> cs2 = c2.getDeclaredConstructor();
        System.out.println(cs2);

    }
}

class Outer{
    class Inner1{

    }

    static class Inner2{

    }
}