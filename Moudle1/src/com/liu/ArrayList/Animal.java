package com.liu.ArrayList;

/**
 * //this和super都不能在静态方法中使用，如要调用子类重写过的父类的方法，可以通过创建父类对象来调用
 * toString是Object中的一个方法，会返回对象的基本信息，比如地址哈希值，希望返回特定的信息需要重写toString
 * 类会提供默认无参构造器，但创建有参构造器后，无参构造器不在默认创建，需要手动创建，否则在创建对象时，容易报错，一般提供了有参就要
 * 提供无参构造器，子类的无参构造器会先调用父类的无参构造器，
 */

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        System.out.println("调用了父类有参构造器~~~");
        this.name = name;
        this.color = color;
    }

    public Animal() {
        System.out.println("调用了父类无参构造器");
    }

    public String setName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return name+"->"+color;
    }

    public void idea()
    {
        System.out.println("我是父类的方法");
    }
}
class Cat extends Animal{
    private int age;
    void shout()
    {
        System.out.println(getColor() + "的" + age + "岁的" + setName() + "在喵喵的叫~~~");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat() {
        System.out.println("用得上我自己的无参构造器吗，应该用不上吧");
    }

    public Cat(String name, String color, int age) {
        super(name, color);
        this.age = age;
        System.out.println("也用了我自己的有参构造器");
    }

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public void idea() {
        System.out.println("我是子类，我重写了父类的方法");
    }
}
class test04{
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("小猫咪");
        c1.setColor("橘色");
        c1.setAge(1);
        c1.shout();
        System.out.println(c1);
        System.out.println("-------------------------");
        Cat c2 = new Cat("大猫咪","黄色",2);
        c2.shout();
        System.out.println(c2);
        c1.idea();
        Animal animal = new Animal();
        animal.idea();





    }
}
