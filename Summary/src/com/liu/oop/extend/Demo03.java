package com.liu.oop.extend;

/**
 * 子类通过this(...)去调用本类的其他构造器，本类其他构造器会通过
 * super(...)去手动调用父类的构造器，最终还是会调用父类构造器的
 */

public class Demo03 {
    public static void main(String[] args) {
        Student s1 = new Student("张三","遵义四中",20);
        System.out.println(s1);
        Student s2 = new Student("李四",22);
        System.out.println(s2);


    }
}
class Persons
{
    public static String schoolName;
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

    public Persons(String name, String schoolName, int age) {
        this.name = name;
        this.schoolName = schoolName;
        this.age = age;
        System.out.println("还是调用我这个父类有参构造器了吧");
    }

    public Persons() {
        System.out.println("父类无参构造器");
    }

    @Override
    public String toString() {
        return "我叫"+name+"来自"+schoolName+"今年"+age+"岁了";
    }
}
class Student extends Persons{
    public Student(String name, int age){
        this(name,"正安县第八中学", age);
    }
    public Student(String name, String schoolName, int age){

        super(name, schoolName, age);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
