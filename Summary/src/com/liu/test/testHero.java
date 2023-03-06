package com.liu.test;

public class testHero {
    //输出倒数k个结点
    public static void main(String[] args) {
        Hero heat = new Hero();
        Hero hero1 = new Hero("宋江", 1, "及时雨");
        Hero hero2 = new Hero("林冲", 2, "豹子头");
        Hero hero3 = new Hero("柴进", 3, "小旋风");
        Hero hero4 = new Hero("鲁智深", 4, "花和尚");
        heat.next = hero1;
        hero1.next = hero2;
        hero2.next = hero3;
        hero3.next = hero4;
    }

    public static Hero num(int k) {
 return null;
    }
}
