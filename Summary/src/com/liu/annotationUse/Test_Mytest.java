package com.liu.annotationUse;

import java.lang.reflect.Method;

public class Test_Mytest {
    @Mytest
    public void speak(){
        System.out.println("执行speak");
    }
    @Mytest
    public void run(){
        System.out.println("执行run");
    }
    public void read()
    {
        System.out.println("执行read");
    }

    public static void main(String[] args) throws Exception {
        Test_Mytest t = new Test_Mytest();
        //1.获取类对象
        Class c = Test_Mytest.class;

        //2.获取全部方法对象
        Method[] methods = c.getDeclaredMethods();

        //3.遍历方法数组存在Mytest就执行
        for (Method method : methods) {
            if(method.isAnnotationPresent(Mytest.class)){
                method.invoke(t);
            }
        }
    }
}
