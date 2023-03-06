package com.liu.interfaceUse;

/**
 * 1.接口（interface）类是用来被实现的（implements），实现接口的类成为实现类，实现类可以理解成所谓的子类
 * 2.一个类实现接口，必须重写完接口的全部抽象方法，否则这个类就要被定义成抽象类
 * 3.接口可以被类多实现，接口与接口可以多继承，一般整合多个接口为一个接口便于子类实现
 * 4.JDK8之后接口中除了抽象方法还可以定义其他三种方法，这些方法都会默认用public修饰
 *   4.1 默认方法：用default修饰，可以有方法体，用实现类的对象调用 defaul void run（）{System.out.println("奔跑");}
 *   4.2 静态方法：用static修饰，可以有方法体，!必须!用接口类名调用  static void study（）{System.out.println("快乐的学习");}
 *   4.3 私有方法：用private修饰，可以有方法体，只能在本类中被其他默认方法或私有方法访问
 *       private void go（）{System.out.println("准备");}
 * 5.JDK8之前接口中只能有抽象方法和常量，抽象方法的public abstract可以省略不写，常量的public static final也可以省略不写
 * 6.和抽象类一样接口不能创建对象，接口就是把抽象进行到底
 * 7.一个类实现多个接口，多个接口中有相同的静态方法不冲突，因为接口A只能调用A的，B只能调用B的
 * 8.一个类继承了父类同时又实现了接口，父类和接口中同名的方法默认用父类的（父类是亲爹，接口是干爹）
 * 9.一个类中实现多个接口，多个接口中存在同名的默认方法不冲突，这个类重写该方法即可
 * 10.一个接口继承多个接口是没有问题的，如果多个接口中存在规范冲突则不能多继承
 */
public class interfaceDemo01 implements A,B {
    public static void main(String[] args) {
        interfaceDemo01 i = new interfaceDemo01();
       // i.run() 默认方法只能用类名访问
        A.run();
        B.run();
        i.speak();

    }

    @Override
    public void speak() {
        A.super.speak();
    }
}
interface A{
    static void run(){
        System.out.println("A在奔跑");
    }
    default void speak()
    {
        System.out.println("我想撒尿");
    }
}
interface B{
    static void run(){
        System.out.println("B在奔跑");
    }
    default void speak()
    {
        System.out.println("我想拉屎");
    }
}
