package com.liu.abstractUse;

/**
 * 1.abstract修饰的类就是抽象类，abstract修饰的方法就是抽象方法
 * 2.抽象方法只有方法签名不能声明方法体
 * 3.一个类中如果声明了抽象方法那么这个类必须声明为抽象类，否则会报错
 * 4.抽象类的基本作用是作为父类，用来被继承的，一个类如果继承了抽象类，那么这个类
 * 必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类
 * 5.类的成员（成员方法，成员变量，构造器）抽象类都具备，不能用abstract修饰变量、代码块
 * 构造器
 * 6.得到了抽象方法，失去了创建对象的能力
 * 7.abstract与final互斥：abstract定义的抽象类作为模板让子类继承，final定义的类不能
 * 被继承，抽象方法定义的通用功能让子类重写，final定义的方法子类不能重写
 * 8.模板方法模式
 */
public abstract class AbstractDemo01 {
    public final void write() {
        System.out.println("\t\t\t《我的区长父亲》");
        System.out.println("我的爸爸是一个很慈祥的爸爸~~");
        writeMain();
        System.out.println("我的爸爸永远都是那么的朴实无华，那么的让人上头");
    }

    public abstract void writeMain();

}
class MidStudent extends AbstractDemo01{

    @Override
    public void writeMain() {
        System.out.println("我的爸爸可牛逼了，坐他的车我从来不看红绿灯~~~");
    }
}

class MinStudent extends AbstractDemo01{

    @Override
    public void writeMain() {
        System.out.println("我的爸爸打牌赢过十万块钱，也很厉害~~~");
    }
}
class test{
    public static void main(String[] args) {
        MidStudent m = new MidStudent();
        m.write();
        System.out.println("---------------------------------");
        MinStudent s = new MinStudent();
        s.write();
    }
}

