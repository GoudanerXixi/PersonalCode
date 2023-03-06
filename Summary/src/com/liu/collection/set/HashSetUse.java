package com.liu.collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 1.无序，不重复，无索引
 * 2.数据结构：哈希表（JDK8之后，数组+链表+红黑树(链表长度超过8自动转换红黑树）的集合体）
 * 3.存储流程：根据对象的hasaCode()方法获取对象的哈希值，根据哈希值计算存储位置，判断该位置是否有对象，没有则存入，
 *   有则调用equals()方法比较对象是否相等，相等舍弃对象，不相等存入集合，挂在原元素的下面
 * 4.多数类自己重写了这两个方法但是，自定义的类型对象存入HashSet需要重写HashSet()和equals()方法
 */
public class HashSetUse {
    public static void main(String[] args) {
         Set<Student> set = new HashSet<>();
         set.add(new Student("张三", 20));
         set.add(new Student("李四", 25));
         set.add(new Student("张三", 20));//相同元素还是被添加，因为两个变量所引用的对象地址不同，需要重写方法才能不存入
         set.add(new Student("王五", 22));
         System.out.println(set);
    }
}
class Student{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(){

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

    @Override
    public String toString() {
        return name + "：" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
