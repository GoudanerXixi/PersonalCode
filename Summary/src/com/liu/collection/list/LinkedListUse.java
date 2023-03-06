package com.liu.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构：双链表
 * 优点：对首位操作极快
 */
public class LinkedListUse {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("小明");
        list.add("老王");
        list.add("王炸");
        list.add("刀妹");
        System.out.println(list);
        System.out.println("----------------------");

        //1.forEach 遍历 不能改变数组中的值
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------");

        //2.Iterator 遍历  在Iterator遍历中删除元素需要用Iterator自带的remove
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object str = it.next() ;
            if(str.equals("王炸")){
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println("-----------------");

        //lambda遍历
        list.forEach(obj -> System.out.println(obj));

    }
}
