package org.example.reflection;

public class RefDemo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);
        // 方法一：从对象中获得class
        Class<? extends Person> c1 = person.getClass();
        System.out.println(c1.hashCode());
        // 方法二：froName 获取
        Class<?> c2 = Class.forName("org.example.reflection.Student");
        System.out.println(c2.hashCode());
        // 方法三；通过类名.class
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());
        //
        Class<?> superclass = c1.getSuperclass();
        System.out.println(superclass);


    }

}

class Person{
    public String name;
    public Person(){};

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}