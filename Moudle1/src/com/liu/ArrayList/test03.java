package com.liu.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test03{
    /**
    了解Object中的String，Animal会默认继承Object中的toString，会打印对象的地址
     *
     */

    public static void main(String[] args) {
    //1.打印地址，默认调用Object的toString
    Animal a = new Animal("大黄","黄色");
    Animal a1 = new Animal("来福","白色");
    Animal a2 = new Animal("招财","黑色");
    Animal a3 = new Animal("来福","白色");
    System.out.println(a);
    System.out.println(a1);
    System.out.println(a2.toString());
    System.out.println(a3.toString());

    List<Animal> animals = new ArrayList<>();
    Collections.addAll(animals,a,a1,a2,a3);
    System.out.println(animals);

    System.out.println(a1.equals(a3));//默认比较内容，返回boolean类型  true

        String s1 = "xixi";
        String s2 = "goudaner";
        String s3 = "xixi";
        Integer i = 10;
        Integer i1 = 200;
        Integer i3 = 10;
        System.out.println("------------------");
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(i == i1);//
        System.out.println(i == i3);
        System.out.println(i.equals(i1));
        System.out.println(i.equals(i3));
        System.out.println(i1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());


    }




}
