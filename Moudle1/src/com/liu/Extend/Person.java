package com.liu.Extend;

public class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类有参构造器");
    }
    public static void speak()
    {
        System.out.println("父类的方法");
    }

    public Person() {
        System.out.println("父类无参构造器");
    }

    private String name;
    private int age;

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
}
