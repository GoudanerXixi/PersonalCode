package com.liu.reflectUse;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 使用反射技术获取成员变量并使用
 */
public class Reflect_Field_Demo {
    @Test
    public void getFiled() throws Exception {
        //1.获取类对象
        Class c = Student.class;
        //2.定位成员变量
        //Field[] getDeclaredFields() 返回所有成员变量 对象 的数组，存在就能拿到
        //Field getDelaredField(String name)  返回单个成员变量对象，存在就能拿到
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "====>" + field.getType());
        }
        Field field = c.getDeclaredField("age");
        Field field2 = c.getDeclaredField("name");

        //3.在某个对象中对其进行取值和复制
        Student s = new Student();
        //赋值，成员变量私有化通过暴力反射打开权限
        field.setAccessible(true);
        field2.setAccessible(true);
        field.set(s, 25);
        field2.set(s, "李华");
        System.out.println(s.getName() + "\t" + s.getAge());

        //取值
        int age = (int) field.get(s);
        System.out.println(age);

        String str = (String) field2.get(s);
        System.out.println(str);

    }
}
