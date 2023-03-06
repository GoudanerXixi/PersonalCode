package com.liu.genericityUse;

import java.util.ArrayList;

/**
 * 泛型可以在类后面（泛型类），方法声明上（泛型方法），接口后面（泛型接口）
 * 1.泛型类的核心思想：把出现泛型变量的地方，全部替换成传输的真实类型
 * 2.泛型类的作用，编译阶段约束操作的数据类型，类似与集合的作用
 */
public class TestMyArrayList {
    /**
     * 目标：模拟ArrayList集合自定义一个MyArrayList集合，完成添加删除功能
     */
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("破晓凯瑞尔");
        list.add("史小韵");
        list.add("马桶");
        list.add("马桶");
        list.remove("马桶");
        System.out.println(list);
    }
}

class MyArrayList<T>{
    private ArrayList lists = new ArrayList();

    public void add(T o){
        lists.add(o);
    }

    public void remove(T o){
        lists.remove(o);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}