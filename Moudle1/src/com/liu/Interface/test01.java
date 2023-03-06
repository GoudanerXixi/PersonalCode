package com.liu.Interface;

/**
 * 匿名内部类
 * 匿名内部类写出来就会创建一个对象相当于当前new的那个的类型的子类
 * 接口不能创建对象!!!
 */

public class test01 {
    public static void main(String[] args) {
       //swimming s = new student();
        swimming s = new swimming() {
            @Override
            public void swim() {
                System.out.println("学生在努力的自由泳~~");
            }
        };

        rate(s);
        System.out.println("-----------------------------");
        rate(new swimming() {
            @Override
            public void swim() {
                System.out.println("学生在努力的自由泳~~");

            }
        });

        System.out.println("------------------------");



    }
    public static void rate(swimming s)
    {
        System.out.println("比赛开始~~");
        s.swim();
        System.out.println("比赛结束~~");

    }

}



interface swimming {
    void swim();
}


//class student implements swimming
//{
//
//    @Override
//    public void swim() {
//        System.out.println("学生在努力的自由泳");
//    }
//}