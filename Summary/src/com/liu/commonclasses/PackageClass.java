package com.liu.commonclasses;

import java.math.BigDecimal;

/**
 * int
 * 1.包装类是基本类型对应的引用类型
 * 2.实现了一起皆对象
 * 3.后期集合和泛型也只能使用包装类
 * 4.作用把基本类型转换成字符串类型（没啥作用）
 * 5.把字符串类型的数值转换成真是的数据类型（很有用）
 * 6.包装类型的默认值是null，容错率更高
 */
public class PackageClass {
    public static void main(String[] args) {
        //1.调用toString()得到字符串结果
        //2.Integer.toString(基本数据类型)
        Integer i = 23;
        String str = i.toString();
        System.out.println(str + 1);//231
        String str1 = Integer.toString(i);
        System.out.println(str1 + 2);//232
        String str2 = i + "";
        System.out.println(str2 + 3);//233
        System.out.println("-----------------------");
        //3.Integer.parseInt("字符串类型的整数")
        //4.Double.parseDouble("字符串类型的小数")
        String str3 = "410";
        String str4 = "13.14";
        int a = Integer.parseInt(str3);
        double b = Double.parseDouble(str4);
        System.out.println(a + 5);//415
        System.out.println(BigDecimal.valueOf(b).add(BigDecimal.valueOf(0.4)));//13.54
        System.out.println("------------------");
        int c = Integer.valueOf(str3);
        double d = Double.valueOf(str4);
        System.out.println(c);
        System.out.println(d);
    }
}
