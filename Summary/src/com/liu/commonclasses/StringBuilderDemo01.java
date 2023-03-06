package com.liu.commonclasses;

/**
 * 1.StringBuilder是一个可变的字符串类，我们可以把它看成是一个对象容器
 * 2.作用是提高字符串的操作效率，如拼接、修改等  只是手段最终还是要恢复成String类型
 * 3.构造器public StringBuilder()  public StringBuilder(String str)
 *
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //1.public StringBuilder append(任意类型)  添加数据并返回StringBuilder对象本身
        StringBuilder s1 = new StringBuilder();
        s1.append(10);
        s1.append("abc");
        s1.append("中国");
        s1.append(false).append("我爱你").append("china");
        System.out.println(s1);


        //2.public StringBuilder reverse()  将对象的内容反转
        s1.reverse();
        System.out.println(s1);

        //3.public int leng()  返回对象内容长度
        System.out.println(s1.length());

        //4.public String toString()  通过toString就可以把StringBuilder转换为String
        String data =  s1.reverse().toString();
        check(data);

    }
    public static void check(String data)
    {
        System.out.println(data);
    }
}
