package com.liu.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ArrayList：有序 可重复 有索引
 * 构造器 public ArrayList{}
 * 集合只能存储引用类型，不支持基本数据类型
 * ArrayList的遍历
 * 数据结构：数组
 */

public class ArrayListUse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,10);//向指定位置添加元素
        System.out.println(list);

        //1.public E get(int index);获取索引处的元素值
        int a = list.get(0);
        System.out.println(a);//1

        //2.public int size(),获取集合的大小（元素的个数）
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("西西");
        list2.add("狗蛋儿");
        list2.add("在一起");
        list2.add("永远");
        int b = list2.size();
        System.out.println(b);//4

        //对集合遍历
        for (int i = 0; i < list2.size(); i++) {
            String s = list2.get(i);
            System.out.println(s);//西西 狗蛋儿 在一起 永远

        }


        //3.public E remove(int index),删除索引位置的元素，并返回被删除的元素值
        String a1 = list2.remove(3);
        System.out.println(a1);//永远
        System.out.println(list2);//[西西，狗蛋儿，在一起]


        //4.public boolean remove(object o):直接删除元素，删除成功返回true，删除失败返回false
        System.out.println(list2);//[西西，狗蛋儿，在一起]，如果元素名称相同，删除第一个出现的
        System.out.println(list2.remove("在一起"));//true
        System.out.println(list2);//[西西，狗蛋儿]


        //5.public E set(int index, E element),修改某个索引位置处的元素
        list2.set(1,"喜欢狗蛋儿");
        System.out.println(list2);//[西西，西西喜欢狗蛋儿]

        //6.
        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(17);
        list3.add(5);
        list3.add(7);
        list3.add(13);
        for (int i = 0; i < list3.size(); i++) {
            if(list3.get(i)<10)
            {
                list3.remove(i);
                //i--
                //从后向前遍历
            }

        }
        System.out.println(list3);//10 17 7 13因为索引会自动向后跳所以会删不干净
    }
}
