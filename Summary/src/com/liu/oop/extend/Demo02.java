package com.liu.oop.extend;

/**
 * 1.super调用父类有参构造器的作用：初始化继承自父类的数据
 * 2.如果父类中没有无参构造器会报错，因为子类时默认调用父类的无参构造器
 * 3.子类构造器可以通过书写super()，手动调用父类的有参构造器
 * 4.this(...)和super(...)都只能放在构造器的第一行，所以二者不能共同存在在一个构造器中
 */

public class Demo02 {
    public static void main(String[] args) {
        Teacher t = new Teacher("张老师",25);
        System.out.println(t.getName());
        System.out.println(t.getAge());
    }

}
class People{
    private String name;
    private int age;


    public People(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用了父类有参构造器");
    }

    public People()
    {

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
}
class Teacher extends People{
    public Teacher(String name, int age)
    {
        super(name,age);
    }

}
