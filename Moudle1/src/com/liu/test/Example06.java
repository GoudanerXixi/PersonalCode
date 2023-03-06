package com.liu.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Example06 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("西西");
        c.add("狗蛋儿");
        c.add("爱情");
        c.add("婚姻");
        System.out.println(c);
        Iterator<String> it = c.iterator();//得到当前集合的迭代器对象
        while (it.hasNext()){
            String st = it.next();
            System.out.println(st);

        }
        System.out.println("------------------------");
        for (String st : c) {
            System.out.println(st);

        }
        System.out.println("---------------------");
        double[] d = {12.3,60.0,59.5,90.5,100.0};
        for (double d1 : d) {
            System.out.println(d1);
        }
        System.out.println("---------匿名内部类------------");
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("-------------Lambda------------");
        c.forEach(s-> System.out.println(s));

        System.out.println("-----------离了个大谱---------------");
        c.forEach(System.out::println);
    }
}
