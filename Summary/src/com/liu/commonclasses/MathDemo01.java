package com.liu.commonclasses;

public class MathDemo01 {
    public static void main(String[] args) {
        //1.public static int abs(int a)  获取参数绝对值
        int a = -10;
        System.out.println(Math.abs(a));

        //2.public static double ceil(double a)  向上取整
        double b = 7.01;
        System.out.println(Math.ceil(b));

        //3.public static double floor(double a)  向下取整
        double c = 7.99;
        System.out.println(Math.floor(c));

        //4.public static int round(float a)  四舍五入
        float d = 6.49F;
        double e = 6.51;
        System.out.println(Math.round(d));
        System.out.println(Math.round(e));

        //5.public static int max(int a, int b)  获取两个int值中的最大值

        //6.public static double pow(double a, double b)  返回a的b次幂的值

        //7.public static double random()   返回值为double的随机值，范围[0.0,1.0)
    }
}
