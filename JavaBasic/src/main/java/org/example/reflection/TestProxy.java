package org.example.reflection;

import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        // 创建目标对象
        TibetanMastiff tibetanMastiff = new TibetanMastiff();
        MyInvocationHandler handler1 = new MyInvocationHandler(tibetanMastiff);
        // 创建代理对象
        Dog dog = (Dog) Proxy.newProxyInstance(
                tibetanMastiff.getClass().getClassLoader(),
                tibetanMastiff.getClass().getInterfaces(),
                handler1);

        // 执行代理对象的方法
        dog.bark();
        dog.run();
    }
}
