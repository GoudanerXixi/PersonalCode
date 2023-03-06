package com.liu.abstractUse.foundation;

/**
 * 1.自动类型转换 （小范围给大范围）
 * 2.强制类型转换  （大范围给小范围，数据可能会（溢出）丢失，浮点型向整型转换直接抹去小数部分
 * 3.运算过程以最高类型为准
 * byte short char 直接转换成int类型进行运算
 * 有小数的会自动当成double运算
 * byte boolean 1  char short 2  float int 4 double long 8
 */
public class TypeConversion {
    public static void main(String[] args) {
        byte a = 4;
        byte b = 10;
        //byte c = a + b; 报错不能用byte来接，因为byte运算会直接转换为int
        byte c = (byte)(a + b);
        System.out.println(c);
        //可能会出现下面情况而造成数据溢出
        byte a1 = 100;
        byte b1 = 101;
        //byte c = a + b;  bute: -128~127
        byte c1 = (byte)(a1 + b1);
        System.out.println(c1);//数据溢出


        byte a2 = 20;
        int a3 = 40;
        double a4 = 50.0;
        //int a5 =a2 + a3 + a4;   会转换成最高类型double
        double a5 =a2 + a3 + a4;
        System.out.println(a5);

        //int c3 = 10+20+10.0;小数会把最高类型认为是double所以需要double来接
    }
}
