package com.liu.reflectUse;

import java.lang.reflect.Constructor;

public class Reflect_Function_Demo2_Test {
    public static void main(String[] args) throws Exception {
        Class c = Student.class;
        Constructor constructor = c.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Student s = (Student) constructor.newInstance("李华", 25);
        Reflect_Function_Demo2.saveInstance(s);

        Dog d = new Dog("大黄", 10000, "黄色", 2);
        Reflect_Function_Demo2.saveInstance(d);

    }
}
