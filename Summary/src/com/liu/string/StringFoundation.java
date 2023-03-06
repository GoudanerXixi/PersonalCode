package com.liu.string;

/**
 * 1.字符串对象的创建
 * 2.String是不可变字符串类型，他的对象在创建后不可修改
 * 3.以""给出的字符串对象存储在常量池中其他的在堆内存,而且相同的内容只会存在一份
 * 4.字符串变量存储的是字符串对象的地址
 * 5.String变量的每次修改会产生并指向新的字符串对象，原来的字符串对象都没有改变所以称为不可变字符串
 */

public class StringFoundation {
    public static void main(String[] args) {
        //1.字符串对象的创建
        String s1 = "刘纵横";
        String s2 = new String();//几乎不用
        String s3 = new String("刘纵横");//实际会产生两个对象，但在这里只会产生一个，因为s1，几乎不用
        System.out.println(s1 == s3);//false 一个指向字符串常量池，一个指向堆内存
        char[] ch = {'l', 'z', 'h'};
        String s4 = new String(ch);//几乎不用
        System.out.println(s4);//lzh
        byte[] by = {97, 98, 99, 100};
        String s5 = new String(by);
        System.out.println(s5);//abcd
        System.out.println("--------------------------");
        String s6 = "abc";
        String s7 = "abc";
        System.out.println(s6 == s7);//true  s6 s7都存储的是”abc“在字符串常量池的地址

        char[] cha = {'a', 'b', 'c'};
        String s8 = new String(cha);
        String s9 = new String(cha);
        System.out.println(s8 == s9);//false 通过构造器new，每new一次都会产生一个新对象在堆内存中

        String ss1 = new String("ijk");//产生两个对象，指向堆内存中的ijk
        String ss2 = "ijk";//指向字符串常量池中的ijk
        System.out.println(ss1 == ss2);//false

        String ss3 = "abc";
        String ss4 = "ab";
        String ss5 = ss4 + "c";
        System.out.println(ss5 == ss3);//false String变量的每次修改会产生并指向新的字符串对象

        String ss6 = "a" + "b" + "c";
        System.out.println(ss6 == ss3);//true java 存在编译优化机制，程序在编译时："a"+"b"+"c"会直接转换成"abc"


    }
}
