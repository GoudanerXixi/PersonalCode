package com.liu.staticUse;

/**
 * 1.成员变量分为静态成员变量和实例成员变量
 * 2.实例成员变量通过 对象名.实例成员 变量访问 属于每个对象
 * 3.静态成员变量通过 类名.静态成员变量 或者 对象名.静态成员变量（不推荐）访问 属于类，加载一次可以被共享访问
 *   可以表示在线人数等需要被共享访问的信息，可以被共享访问
 * 4.同一个类中静态成员变量的访问可以省去类名
 * 5.静态成员方法有static修饰，归属类 推荐用类名访问，也可以用对象访问  使用场景： 表示对象自己行为的，且方法中需要访问
 *   实例成员的必须声明成实例方法
 * 6.实例成员方法无static修饰，归属对象 只能用对象访问    使用场景：以执行一个共同功能为目的，则可以申明成静态方法
 * 7.静态方法只可以访问静态的成员，不可以直接访问实例成员，实例方法可以访问静态的成员，也可以访问实例成员
 * 8.静态方法中不可以出现this关键字   工具类内部都是静态方法，可以将构造器私有化，不需要对外产生对象
 * 9.静态代码块static{}，随着类的加载而加载，并且自动触发，只执行一次，可以做一些静态数据初始的操作，以便后续使用
 * 10.{} 构造代码块，每次创建对象调用构造器执行时都会在构造器执行前执行代码块中的代码，用于初始化实例资源（了解，见得少）
 */
public class test01 {

    public test01(){
        System.out.println("我是无参构造器会在构造代码块后执行");
    }
    {
        System.out.println("我是构造代码块，会在构造器执行前执行");
    }


    public  void fun1()
    {
        System.out.println("调用方法1");
    }
    public  void fun()
    {
        System.out.println("调用方法2");
    }
}
class test02{
    public static String SchoolName;
    static {
        System.out.println("我是静态代码块");
        SchoolName = "正安县第八中学";
    }
    public static void main(String[] args) {
        System.out.println("main方法执行了");
        test01 t = new test01();
        test01 t1 = new test01();
        t.fun();
        t.fun1();
        System.out.println(SchoolName);
    }

}
