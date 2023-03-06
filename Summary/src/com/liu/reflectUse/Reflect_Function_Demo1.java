package com.liu.reflectUse;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 反射的作用：破坏封装性
 * 编译成class文件进行运行阶段的时候，泛型会自动擦除
 * 反射是作用在运行时的技术，此时已经不存在泛型
 */
public class Reflect_Function_Demo1 {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        System.out.println(list.getClass());
        System.out.println(list1.getClass());
        Collections.addAll(list, "张三", "李四", "王五");
        //通过反射往集合里添加其他类型的元素
        //1.获取类对象
        Class c = list.getClass();

        //2.获取方法对象
        Method add = c.getDeclaredMethod("add", Object.class);

        //add.setAccessible(true);

        //3.定位c类中的add方法
        boolean re1 = (boolean) add.invoke(list, 1);
        boolean re2 = (boolean) add.invoke(list, 2);
        boolean re3 = (boolean) add.invoke(list, 3);
        System.out.println(re1);
        System.out.println(list);


    }
}
