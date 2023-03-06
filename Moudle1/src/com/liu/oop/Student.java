package com.liu.oop;

public class Student {
    private String name;
    private int studentNumber;
    private String className;
    private int age;

    public Student()
    {

    }

    public Student(String name, int studentNumber, String className, int age) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.className = className;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
