package org.example.jvm;

public class Son extends Father{
    public Son() {
        // invokespecial
        super();
    }

    public Son(int age) {
        // invokespecial
        this();
    }

    // 不是重写的父类的静态方法，因为静态方法不能被重写
    public static void showStatic(String str) {
        System.out.println("Son " + str);
    }

    private void showPrivate(String str) {
        System.out.println("Son private " + str);
    }

    public void  info(){
    }

    public static void display(Father f){
        f.showCommon();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }

    public void show(){
        // invokstatic
        showStatic("atguigu.com");
        // invokestatic
        super.showStatic("good!");
        // invokespecial
        showPrivate("hello!");
        // invokespecial
        super.showCommon();
        // invokevirtual
        // 因为此方法声明有final，不能被子类重写，所以也认为此方法是非虚方法
        showFinal();
        // invokevirtual
        showCommon();
        info();
        MethodInterface in = null;
        // invokeinterface
        in.methodA();
    }
}


interface MethodInterface{
    void methodA();
}
