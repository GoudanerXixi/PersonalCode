package com.liu.Extend;

public class test01 {
    public static void main(String[] args) {
        Student s1 = new Student("西西",23);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        Student s2 = new Student();
        s2.setName("狗蛋儿");
        s2.setAge(21);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

        Student s3 = new Student(25);
        System.out.println(s3.getName());
        System.out.println(s3.getAge());

        Person.speak();
        Student.speak();
        s1.speak();



    }
}
