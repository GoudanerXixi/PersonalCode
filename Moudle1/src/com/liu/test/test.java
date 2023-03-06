package com.liu.test;

public class test {
    public static void main(String[] args) {
        //1.建一个电影类
        Movice[] movices = new Movice[3];
        movices[0] = new Movice("杀手不太冷",8.0,"沈腾");
        movices[1] = new Movice("战狼",9.0,"吴京");
        movices[2] = new Movice("前任三",8.2,"于文文");
        for (int i = 0; i < movices.length; i++) {
            Movice c = movices[i];
            System.out.println("电影名称："+ c.getName());
            System.out.println("电影评分："+c.getScore());
            System.out.println("主演："+c.getDoctor());
            System.out.println("-----------------------------------");

        }

    }
}
