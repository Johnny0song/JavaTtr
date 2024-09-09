package org.example.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationTest {
    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;
        MyAnnotation myAnnotation = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.value());
    }
}


@MyAnnotation(value = "worlda")
class MyClass {
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "hello";
}