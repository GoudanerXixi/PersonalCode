package com.liu.oop;

public class textInstance1 {
    public static void main(String[] args) {

    //无法正常创建对象   SingInstance1 s1 = new SingInstance1();
    SingInstance1 s1 = SingInstance1.instance1;//创建对象成功
    }
}
