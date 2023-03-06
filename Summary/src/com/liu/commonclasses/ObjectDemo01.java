package com.liu.commonclasses;

import java.util.Objects;

/**
 * 1.一个类要么默认继承了Object类，要么间接继承了Object类，Object是Java的祖宗类
 * 2.Object的方法是一切子类可以直接使用的
 * 3.官方在进行字符串比较时，没有对象自己的equals方法，而是选择了Objects的equals来比较两个对象，Obejects的equals比较方法更安全
 */

public class ObjectDemo01 {
    public static void main(String[] args) {
        //1.public String toString()  默认输出对象的地址，toString()的意义就是让子类重写，以便返回
        //对象的内容信息，而不是地址信息

        //2.public Boolean equals(Object o) 默认是比较当前对象与另一个对象的地址是否相同，相同返回true反之4
        //直接比较两个对象的地址是否相同可以直接使用 == 替代equals，equals()的意义就是让子类重写，以便子类自己定制比较规则
        //对字符串而言比较的是内容，因为字符串本身重写了equals，Objects.equals()更安全
        String s1 = null;
        String s2 = "liuzongheng";
        //System.out.println(s1.equals(s2));  会出现空指针异常,不安全
        String s3 = new String("liuzongheng");
        System.out.println(Objects.equals(s1, s2));//false
        System.out.println(Objects.equals(s2, s3));//true 内容一样
        System.out.println(s2.equals(s3));//true
        System.out.println(s2 == s3);//false
        //Objects.isNull判断是否为空，空返回true，反之
        System.out.println("------------------");//比较地址
        Student ss1 = new Student("刘纵横");
        Student ss2 = new Student("刘纵横");
        System.out.println(ss1 == ss2);//false
        System.out.println(ss1.equals(s2));//true   烦死了为什么会是false
        System.out.println(Objects.equals(ss1, ss2));//false

    }
}
class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    @Override//可以自动生成equals比较内容，也可以自动生成toString
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

}
