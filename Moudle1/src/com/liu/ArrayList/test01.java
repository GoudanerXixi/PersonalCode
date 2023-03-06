package com.liu.ArrayList;

public class test01 {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",20);
        Person p3 = new Person();
        p3.setName("王麻子");
        p3.setAge(25);
        p1.speak1();
        p2.speak1();
        p1.speak2();
        p2.speak2();




    }
}
