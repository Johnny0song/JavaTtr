package org.example.reflection;

public class RefDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("org.example.reflection.Fruit");
        Class c2 = Class.forName("org.example.reflection.Fruit");
        Class c3 = Class.forName("org.example.reflection.Fruit");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}

class Fruit{
    private int id;
    private String name;
    private int age;

    public Fruit() {
    }

    public Fruit(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}