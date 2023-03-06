package com.liu.ArrayList;

public class test {
    public static void main(String[] args) {
        Person.text();
        //speak();
        Person p = new Person();
        p.text();//不建议
        test t = new test();
        t.speak();
        run();

    }
    public void speak()
    {
        Person.text();
    }
    public static void run()
    {
        System.out.println("奔跑~~");
        Person p1 = new Person();
        p1.max();
    }
}
//静态的是公用的在自身和成员方法（变量）中都可访问 类名.静态方法（静态成员变量），同一个类中静态成员方法还可省略类名，但是静态的不推荐用对象访问，
//static中不能出现this
//成员方法、成员变量只能通过对象访问，成员方法和成员变量间也可以直接访问
