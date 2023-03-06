package com.liu.reflectUse;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 使用反射技术获取方法对象并使用
 */
public class Reflect_Method_Demo {
    @Test
    public void getMethod() throws Exception {
        //1.获取类对象
        Class c = Student.class;

        //2.获取方法对象
        //Method[] getDeclaredMethods  返回所有成员方法对象的数组，存在就能拿到
        //Method getDeclaredMethod(String name, Class<?>...paramaterTypes)  返回单个成员方法对象，存在就能拿到
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "返回值类型："
                    + method.getReturnType() + "参数个数：" + method.getParameterCount());
        }
        System.out.println("----------------------");
        Method method = c.getDeclaredMethod("eat", String.class, double.class);
        Method method1 = c.getDeclaredMethod("eat");
        System.out.println(method.getName() + "返回值类型："
                + method.getReturnType() + "参数个数：" + method.getParameterCount());

        //3.触发执行方法
        //Object invoke(Object obj, Object args)
        //没有权限就暴力打开
        method.setAccessible(true);
        Student s = new Student();
        Object result = method.invoke(s, "李华", 80.5);
        method1.invoke(s);
        System.out.println(result);


    }
}
