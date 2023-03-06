package com.liu.reflectUse;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 目标：从类对象中获取类的构造器
 */
public class Reflect_Constructor_Demo {
    //1.Constructor<?>[] getConstructors() 返回所有构造器的数组(只能拿public的)
    @Test
    public void getConsrtuctors() {
        //1.获取类对象
        Class c = Student.class;
        //2.提取类中的全部构造器对象
        Constructor[] constructors = c.getConstructors();
        //3.遍历构造器
        for (Constructor constructor : constructors) {
            //getName()：构造器名字  getParameterCount()：获取构造器的个数
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        }
    }

    //2.Constructor<?>[] getDeclaredConstructors() 返回所有构造器的数组，存在就能拿到
    @Test
    public void getDeclaredConsrtuctors() {
        //1.获取类对象
        Class c = Student.class;
        //2.提取类中的全部构造器对象
        Constructor[] constructors = c.getDeclaredConstructors();
        //3.遍历构造器
        for (Constructor constructor : constructors) {
            //getName()：构造器名字  getParameterCount()：获取构造器的个数
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        }
    }

    //3.Constructor<T> getConstructor(Class<?>...parameterTypes) 返回单个构造器对象(只能拿public的)
    @Test
    public void getConsrtuctor() throws Exception {
        //1.获取类对象
        Class c = Student.class;
        //2.定位单个构造器对象(按照参数定位无参数构造器)
        Constructor con = c.getConstructor();
        System.out.println(con.getName() + "==>" + con.getParameterCount());

    }

    //4.Constructor<T> getDeclaredConstructor(Class<?>...parameterTypes)  返回单个构造器对象，存在就能拿到
    @Test
    public void getDeclaredConsrtuctor() throws Exception {
        //1.获取类对象
        Class c = Student.class;
        //2.定位单个构造器对象(按照参数定位无参数构造器)
        Constructor con = c.getDeclaredConstructor();
        System.out.println(con.getName() + "==>" + con.getParameterCount());

        Constructor con2 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(con.getName() + "==>" + con2.getParameterCount());
    }

    //5.用反射技术获取构造器对象并使用
    //T newInstance(Object...initargs) 根据指定的构造器创建对象
    @Test
    public  void  getInstance() throws Exception {
        //1.获取类对象
        Class c = Student.class;
        //2.定位无参构造器和有参构造器
        Constructor cons = c.getDeclaredConstructor();
        Constructor cons2 = c.getDeclaredConstructor(String.class, int.class);

        //3.创建对象
        Student s = (Student) cons.newInstance();
        System.out.println(s.getName() + " " + s.getAge());

        //私有构造器不能创建对象的时候可以暴力反射
        //piublic void setAccessible(boolean flag)  //设置为true，表示取消访问检查，进行暴力反射
        //反射破坏的私有的也可以执行了
        cons2.setAccessible(true);//权限被打开
        Student s2 = (Student) cons2.newInstance("李华", 25);
        System.out.println(s2.getName() + " " + s2.getAge());
    }
}
