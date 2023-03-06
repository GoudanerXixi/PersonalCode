package com.liu.test;

public class text {
    public static void main(String[] args) {
        Car c1 = new Car("奔驰",30);
        Car c2 = new Car("宝马",20);
        System.out.println("这辆" + c1.name + "的价格是:" + c1.price);
        System.out.println("这辆" + c2.name + "的价格是:" + c2.price);
        System.out.println("----------------------");
        c1.goWith("法拉利");
        c2.goWith("迈凯伦");



    }


}
