package com.liu.reflectUse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * 目标：用反射做一个通用框架，在不清楚对象字段的情况下，可以把对象的字段名称和对应值存储到文件中去
 */
public class Reflect_Function_Demo2 {
    public static void saveInstance(Object o) {
        try(  PrintStream p = new PrintStream(new FileOutputStream("Summary/src/saveInstance.txt", true));) {

            //1.获取类对象
            Class c = o.getClass();

            //c.getSimpleName()获取当前类名  c.getName()获取全限名  包名+类名
            p.println("==============" + c.getSimpleName() + "==============");

            //2.获取全部成员变量
            Field[] fields = c.getDeclaredFields();

            //3.遍历全部的成员变量
            for (Field field : fields) {
                 String name = field.getName();
                 field.setAccessible(true);
                 String value = field.get(o) + "";
                 p.println(name + "=" + value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
