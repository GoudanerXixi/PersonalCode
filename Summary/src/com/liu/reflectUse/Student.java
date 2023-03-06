package com.liu.reflectUse;

public class Student {
    private String name;

    private int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    public void speak() {
        System.out.println("同学们在交流学习");
    }

    private String run() {
        return "同学们操场上跑步~~";
    }

    private String eat(String name, double money) {
        return name + "吃汉堡包" + "花了" + money + "元";
    }

    public void eat() {
        System.out.println("同学们都在吃汉堡包~");
    }

}
