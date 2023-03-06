package com.liu.oop.extend;

/**
 * 1.enum用于信息的标记和分类
 * 2.枚举类都是继承了枚举类型java.lang.Enum
 * 3.枚举都是最终类不可以被继承
 * 4.枚举类的构造器都是私有的不能对外创建对象
 * 5.枚举的第一行都是默认罗列枚举对象名称的
 * 6.枚举相当于是多例模式
 */

public class EnumUse {
    public static void main(String[] args) {
        Season spring1 = Season.SPRING;
        Season spring2 = Season.SUMMER;
        Season spring3 = Season.AUTUMN;
        Season spring4 = Season.WINTER;

    }
    public static void season(Season s)
    {
        switch (s)
        {
            case SPRING:
                System.out.println("这是春天");
                break;
            case SUMMER:
                System.out.println("这是夏天");
                break;
            case AUTUMN:
                System.out.println("这是秋天");
                break;
            case WINTER:
                System.out.println("这是冬天");
                break;
        }
    }

}
enum Season {
    SPRING , SUMMER , AUTUMN , WINTER;
}


