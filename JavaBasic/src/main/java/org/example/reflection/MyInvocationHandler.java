package org.example.reflection;

import java.lang.reflect.Method;

public class MyInvocationHandler implements java.lang.reflect.InvocationHandler {
    private  Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " 方法开始执行");
        Object returnValue = method.invoke(target, args);
        System.out.println(method.getName() + " 方法执行完毕");
        return returnValue;
    }
}
