package com.liu.oop;

/**
 * 懒汉单例模式
 */

public class SingleInstance2 {
    //3.构造一个方法返回单例对象
    public static SingleInstance2 getInstance()
    {
        if(instance2==null)
        {
            instance2 = new SingleInstance2();
        }
        return instance2;
    }
    //2.定义一个静态变量存储对象
    private static SingleInstance2 instance2;
    //1.构造器私有化
    private SingleInstance2()
    {

    }

}
