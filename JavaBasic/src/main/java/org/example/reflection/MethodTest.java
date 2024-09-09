package org.example.reflection;

import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.time.LocalDate");
        Method nowMethod = clazz.getDeclaredMethod("now", null);
        Object date1 = nowMethod.invoke(null);
        System.out.println(date1);

        Method withYear = clazz.getDeclaredMethod("withYear", int.class);
        Object date2 = withYear.invoke(date1, 2020);
        System.out.println(date2);

        Method getYear = clazz.getDeclaredMethod("getYear");
        Object year = getYear.invoke(date2);
        System.out.println(year);
    }
}
