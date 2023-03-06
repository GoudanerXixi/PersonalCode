package com.liu.Extend;

public class Student extends Person {
    public Student()
    {
        System.out.println("子类无参构造器");
    }
    public Student(String name, int age)
    {
        super(name, age);
    }
    public Student( int age)
    {
       this("黑马",age);
    }
}
