package com.liu.test;


import java.util.LinkedList;

public class Example07 {
    public static void main(String[] args) {
        //1.进栈
        LinkedList<String> list = new LinkedList<>();
        list.push("第1颗子弹");
        list.push("第2颗子弹");
        list.addFirst("第3颗子弹");
        list.addFirst("第4颗子弹");
        System.out.println(list);

        //2.出栈
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());

        //3.入队
        LinkedList<String> list2 = new LinkedList<>();
        list2.addLast("第1个人");
        list2.addLast("第2个人");
        list2.addLast("第3个人");
        list2.addLast("第4个人");
        System.out.println(list2);

        //4.出队
        System.out.println(list2.removeFirst());
        System.out.println(list2.removeFirst());
        System.out.println(list2.removeFirst());
        System.out.println(list2.removeFirst());
    }
}
