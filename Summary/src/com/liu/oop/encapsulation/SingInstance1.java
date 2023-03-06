package com.liu.oop.encapsulation;

/**
 * 饿汉单例模式
 */

public class SingInstance1 {
    //2.创建一个静态变量存储对象,获取对象前对象已经提前准备好一个，并且只能有一个
    public static SingInstance1 instance1 = new SingInstance1();
    //1.把构造器私有化
    private SingInstance1()
    {
        System.out.println("饿汉单例模式");
    }
}
class test01{
    public static void main(String[] args) {
     //SingInstance1 s1 = new SingInstance1(); 构造器私有化不能正常创建对象
     SingInstance1 s1 = SingInstance1.instance1;
    }
}
