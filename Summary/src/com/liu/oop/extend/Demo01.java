package com.liu.oop.extend;

/**
 * public class Student extneds People{}
 * 1.通过extends建立起一个类与另一个类的父子关系，Student称为子类（派生类），People称为父类（基类或超类）
 * 2.子类继承父类后可以直接使用父类公共的方法和属性了
 * 3.子类相同的特征（共同属性、共同方法）放在父类中定义，子类独有的属性和行为应该定义在子类自己里面
 * 4.子类可以继承父类的属性和行为，但是子类不能继承父类的构造器
 * 5.一个类只能继承一个直接父类，但一个父类可以有多个子类，支持多层继承
 * 6.Java中所有类都是Object的子类
 * 7.子类创建对象会将父类空间和子类空间作为一块放在堆内存中
 * 8.子类可以继承父类私有成员只是不能直接访问，子类是共享父类的静态成员，算不上继承
 * 9.在子类中访问成员满足就近原则 子类局部->子类成员->父类成员范围  找不到就报错
 * 10.在子父类中出现重名的的成员，使用父类成员可以用  super.父类成员变量/方法
 * 11.当子类需要父类的功能但父类的功能不能完全满足自己的需求是可以重写父类的方法
 *     1.重写方法的名称 形参列表必须与被重写方法的名称形参列表一致
 *     2.私有方法不能被重写
 *     3.子类重写父类的方法时，访问权限必须大于等于父类
 *     4.子类不能重写父类的静态方法，如果重写会报错的
 * 12.子类中的所有构造器默认都会先访问父类的无参构造器，在执行自己，因为在子类初始化的时候，有可能会使用到父类中的数据
 *     如果父类没有完成初始化，子类将无法使用父类的数据，所以在子类初始化之前，一定要调用父类的无参构造器先完成父类数据
 *     空间的初始化，子类构造器的第一行语句默认都是super（），不写也存在
 */
public class Demo01 {
    public static void main(String[] args) {
        newPhone n1 = new newPhone();
        n1.setName("罗托罗拉");
        newPhone n2 = new newPhone("诺基亚");
        n1.call();
        System.out.println("-------------");
        n1.sendMsg();
        System.out.println("------------");
        n2.call();
        System.out.println("---------------");
        n2.sendMsg();
        System.out.println("----------------");
        Phone n3 = new Phone();
        System.out.println("----------");
        n3.call();
        n3.sendMsg();
    }

}
class Phone{
    public void call()
    {
        System.out.println("打电话~~");
    }
    public void sendMsg()
    {
        System.out.println("发短信~~");
    }
    public Phone()
    {
        System.out.println("调用了父类的无参构造器");
    }
}

class newPhone extends Phone{
    @Override
    public void call() {
        super.call();//先用父类的功能
        System.out.println(name+"打开了视频电话");
    }

    @Override
    public void sendMsg() {
        super.sendMsg();
        System.out.println(name+"发送了有趣的图片~~");
    }

    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public newPhone()
    {
        //super();
        System.out.println("我是子类的无参构造器");
    }
    public newPhone(String name)
    {
        //super();
        this.name = name;
        System.out.println("我是子类的有参构造器");
    }
}
