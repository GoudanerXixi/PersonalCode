package com.liu.collection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 1.不重复，无索引，可排序：按照元素的大小默认升序（从小到大排序）
 * 2.数据结构：红黑树，增删改查性能都好
 * TreeSet集合是一定要排序的，可以将元素按照指定的规则排序
 * 默认排序：数值类型（Integer，Double）按大小进行升序排序，字符串类型，按照首字符的编号进行升序排序，自定义类型自己指定排序规则
 * 比较时调用的compareTo（）方法，是在Comparable接口中定义的，所以对自定义的类型进行排序需要继承Comparable重写compareTo()方法
 * 也可以通过TreeSet集合有参数构造器，可以设置compartor接口对应的比较器对象，来定制比较规则
 * 当集合存储的对象有实现比较规则，集合也自带比较器，默认使用集合自带的比较器排序
 */
public class TreeSetUSe {
    public static void main(String[] args) {
      Set<Teacher> set = new TreeSet<>((o1, o2) -> o1.getMoney() - o2.getMoney() );
//        set.add(7);
//        set.add(2);
//        set.add(4);
//        set.add(9);
//        System.out.println(set);
        set.add(new Teacher("张老师", "语文", 8000));
        set.add(new Teacher("王老师", "数学", 9000));
        set.add(new Teacher("李老师", "体育", 6000));
        System.out.println(set);


    }
}
class Teacher /*implements Comparable<Teacher> */{

    private String name;

    private String work;

    private int money;

    public Teacher(String name, String work, int money) {
        this.name = name;
        this.work = work;
        this.money = money;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

//    @Override
//    public int compareTo(Teacher o) {
//        return money - o.money;
//    }

    @Override
    public String toString() {
        return name +" " + work +" " +  "薪水：" + money;
    }
}

