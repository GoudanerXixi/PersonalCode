package com.liu.interfaceUse.innerClasses;

/**
 * 匿名内部类
 * 1.本质上是一个没有名字的局部内部类，定义在方法中、代码块中等
 * 2.作用：方便创建子类对象，最终目的是为了简化代码编写
 * 3.格式 new 类|抽象类名|或者接口名(){ 重写方法 };
 * Employee a = new Employee(){ public void work(){}}; a.work;
 * 4.匿名内部类写出来就会产生一个匿名内部类对象，匿名内部类的对象类型相当于是当前new的那个类型的子类类型
 */
public class innerClassesDemo02 {
    public static void main(String[] args) {
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生在拼命的自由泳");
            }
        };
        go(s1);
        System.out.println("-------------------");
        Swimming s2 = ()-> System.out.println("老师蝶泳像在飞一样~~");//lambda表达式
        go(s2);
        System.out.println("-----------------");
        go(()-> System.out.println("校长狗刨居然游得最快~~"));


    }

    public static void go(Swimming s) {
        System.out.println("比赛开始");
        s.swim();
        System.out.println("比赛结束");

    }
}

interface Swimming {
    void swim();
}
