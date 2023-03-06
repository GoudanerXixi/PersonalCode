package com.liu.ArrayList;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public static String getClassname() {
        return classname;
    }

    public static void setClassname(String classname) {
        Person.classname = classname;
    }

    static private String classname;
    public static void text()
    {
        System.out.println("==========");
    }
    public void max()
    {
        System.out.println("我是最大的"+this.age+classname);
        min();
    }
    public static void min()
    {
        System.out.println("我是最小的"+/*name+*/classname);
    }
    public void speak1()
    {
        System.out.println("我叫" + name + "今年" + age + "岁了");
    }
    public void speak2()
    {
        System.out.println("我叫" + this.name + "今年" + this.age + "岁了");
    }

}
