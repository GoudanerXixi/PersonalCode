package com.liu.commonclasses;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 1.创建对象：public static BigDecimal valueOf(double va1)  包装浮点数成为BigDecimal对象
 * 2.用于解决浮点型运算精度失真问题
 */
public class BigDecimalDemo01 {
    public static void main(String[] args) {
        System.out.println(0.09 + 0.01);//精度失真
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);
        System.out.println("----------------------");
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("------------------------");
        //1.public BigDecimal add(Bigdecimal b)  加法
        BigDecimal a1 = BigDecimal.valueOf(a);//手段
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
        double rs = c1.doubleValue();//目的
        System.out.println(rs);
        //1.public BigDecimal subtract(Bigdecimal b)  减法
        //BigDecimal c1 = a1.subtract(b1);
        //2.public BigDecimal  multiply(Bigdecimal b)  乘法
        //BigDecimal c1 = a1.multiply(b1);
        //3.public BigDecimal   divide(Bigdecimal b)  除法
        //BigDecimal c1 = a1.divide(b1);
        //4.public BigDecimal   divide(另一个BigDecimal对象, 精确几位, 舍入模式)  除法
        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal b11 = BigDecimal.valueOf(3.0);
        //BigDecimal c11 = a11.divide(b11);
        BigDecimal c11 = a11.divide(b11,2, RoundingMode.HALF_DOWN);
        double rs1 = c11.doubleValue();
        System.out.println(rs1);
    }
}
