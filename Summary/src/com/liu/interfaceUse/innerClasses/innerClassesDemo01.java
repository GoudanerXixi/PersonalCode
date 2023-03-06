package com.liu.interfaceUse.innerClasses;

/**
 * 1.静态内部类
 *   1.1对象创建  Outer.Inner in = new Outer.Inner();
 * 2.成员内部类
 *   2.1对象创建  Outer.Inner in = new Outer().new Inner();
 * 3.局部内部类（鸡肋）
 *   3.1:放在方法，代码块，构造器等执行体中，类文件名为：外部类$N内部类.class
 * 4.**匿名内部类（重要）
 *   详见Demo02
 */
public class innerClassesDemo01 {
    public int heartbeat = 150;

    //定义成员内部类
    public class Inner {
        public int heartbeat = 110;

        public void show() {
            int heartbeat = 78;
            System.out.println(heartbeat);//78
            System.out.println(this.heartbeat);//110
            System.out.println(innerClassesDemo01.this.heartbeat);//150
        }


    }
}

class Demo01test01 {
    public static void main(String[] args) {
        innerClassesDemo01.Inner i = new innerClassesDemo01().new Inner();//定义成员内部类对象
        i.show();
    }
}
