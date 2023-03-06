package com.liu.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {

       ArrayList<Student> students = new ArrayList<>();
//       Student c1 = new Student("西西",20201278,"大数据一班",24);
//       Student c2 = new Student("狗蛋儿",20201279,"大数据一班",21);
//       Student c3 = new Student("西门吹雪",20201280,"大数据二班",54);
//       Student c4 = new Student("独孤求败",20201281,"大数据二班",34);
//       students.add(c1);
//       students.add(c2);
//       students.add(c3);
//       students.add(c4);
       students.add(new Student("西西",20201278,"大数据一班",24));
       students.add(new Student("狗蛋儿",20201279,"大数据一班",21));
       students.add(new Student("西门吹雪",20201280,"大数据二班",54));
       students.add(new Student("独孤求败",20201281,"大数据二班",34));

        System.out.println(students.get(0));
        for (int i = 0; i < students.size(); i++) {
            Student c = students.get(i);
            System.out.println(c.getName()+"\t"+c.getStudentNumber()+"\t"+c.getClassName()+"\t"+c.getAge());


        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要查询的学号:");
            int a = sc.nextInt();
            Student c = Inquire(students,a);
            if(c == null)
            {
                System.out.println("对不起查无此人~~");
            }
            else {
                System.out.println("您查询的信息如下:");
                System.out.println(c.getName()+"\t"+c.getStudentNumber()+"\t"+c.getClassName()+"\t"+c.getAge());

            }

        }
    }
    public static Student Inquire( ArrayList<Student> students,int studentNumber)
    {
        for (int i = 0; i < students.size(); i++) {
            Student c = students.get(i);
            if(c.getStudentNumber()==studentNumber)
            {
                return c;
            }

        }
        return null;//查无此人
    }
}
