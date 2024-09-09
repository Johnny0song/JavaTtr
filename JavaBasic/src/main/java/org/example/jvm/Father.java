package org.example.jvm;

/*
 解析调用中非虚方法、虚方法的测试
 invokestatic指令和invokespecial指令调用的方法称为非虚方法，包括实例初始化方法<init>方法，私有方法，静态方法和父类方法
 */
public class Father {
    public Father() {
        System.out.println("Father的构造器");
    }
    public static void showStatic(String str) {
        System.out.println("Father " + str);
    }

    public final void showFinal() {
        System.out.println("Father show final");
    }
    public void showCommon() {
        System.out.println("Father show common");
    }
}
