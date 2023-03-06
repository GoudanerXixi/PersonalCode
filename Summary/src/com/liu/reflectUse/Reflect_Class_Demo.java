package com.liu.reflectUse;

/**
 * 反射：反射是运行时获取文件的字节码文件对象：然后可以解析类中的全部成分
 * 反射的核心思想和关键：得到编译以后的class文件对象
 * 目标：获取Class对象的三种方法
 */
public class Reflect_Class_Demo {
    public static void main(String[] args) throws Exception {
        //1.class中的一个静态方法：forName（全限名：包名 + 类名）
        Class c = Class.forName("com.liu.reflectUse.Student");
        System.out.println(c);//Student.class

        //2.类名.class
        Class c1 = Student.class;

        //3.对象.getClass()  获取对象对应类的Class对象
        Student s = new Student();
        Class c2 = s.getClass();

    }
}
