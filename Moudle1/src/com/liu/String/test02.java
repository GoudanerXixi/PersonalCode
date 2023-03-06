package com.liu.String;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        String Okname = "sixiaoxi";
        Scanner sc = new Scanner(System.in);
        String name = sc.next();//输入sixiaoxi
        System.out.println(name == Okname);//false,Okname存储的是对象sixiaoxi的地址
        System.out.println(Okname.equals(name));//equals，只关心内容是否一致
        String s = "aAbBcC";
        String r = "aabbcc";
        System.out.println(s.equalsIgnoreCase(r));//true,equalsIgnoreCase(),忽略大小写，再关心内容是否一致

        String aa = "12";
        String bb = aa.substring(0,1);
        bb += "*";
        System.out.println(bb);


    }
}
