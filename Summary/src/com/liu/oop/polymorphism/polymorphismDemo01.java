package com.liu.oop.polymorphism;

/**
 * 1.多态：同类型的对象执行同一个行为，会表现出不同的行为特征
 * 2.常见形式: 父类类型 对象名称 = new 子类构造器;
 * 接口    对象名称 = new 实现类构造器;
 * 3.多态成员的访问特点：方法调用： 编译看左边，运行看右边
 * 变量调用： 编译看左边，运行也看左边（多态侧重行为多态）
 * 4.多态的前提：有继承/实现关系；有父类引用指向子类对象；有方法重写
 * 5.右边对象实现解耦性，便于扩展和维护，后续业务行为随对象而变，后续代码无需更改
 * 6.定义方法的时候，使用父类型作为参数，该方法就可以接收这父类的一切子类对象，体现出多态的扩展性与便利
 * *7*：多态不能直接使用子类独有的功能，需要进行强制转换
 * 7.1：自动类型转换（从子到父）：子类对象赋值给父类类型的变量指向
 * 7.2：强制类型转换 （从父到子）：子类 对象变量 = （子类） 父类类型变量  就可以实现调用子类独有功能了
 * 注意：强制转换编译时不会报错但是运行时可能报错，因为强转后的类型和对象真实类型可能不是同一种
 * 解决：java建议强转前用instanceof进行判断，判断关键字左边指向的对象的真实类型是否是右边的类型或其子类类型，是返回true，反之。
 */

public class polymorphismDemo01 {
    public static void main(String[] args) {
        Animal a = new Cat();//new Dog();
        go(a);
        System.out.println("-----------------------");
        Animal b = new Dog();
        go(b);


    }

    //父类型作为参数，该方法就可以接收这父类的一切子类对象
    public static void go(Animal a) {
        System.out.println("开始表演");
        a.eat();
        a.sleep();//同类型的对象执行同一个行为，会表现出不同的行为特征
        if (a instanceof Cat)//先判断关键字左边指向的对象的真实类型是否是右边的类型或其子类类型
        {
            Cat c = (Cat) a;//再通过强转（从父到子）调用子类独有的方法
            c.happy();
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.shout();
        }
        System.out.println("表演完美落幕");

    }

}

interface Animal {
    void eat();

    void sleep();
}

class Cat implements Animal {
    private String name;

    @Override
    public void eat() {
        System.out.println("猫在吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫在睡觉");
    }

    public void happy()//猫类独有的方法
    {
        System.out.println("我们一起学猫叫，一起喵喵喵喵喵");
    }


}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗在吃屎~~");
    }

    @Override
    public void sleep() {
        System.out.println("狗在睡觉~~");
    }

    public void shout()//狗类独有的方法
    {
        System.out.println("狗在汪汪的叫~~");
    }
}
