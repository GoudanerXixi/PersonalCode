package com.liu.IoStream;

import java.util.Arrays;

public class ioDeom01 {
    /**
     *字符集 编码和解码  字节输入输出流  字符输入输出流  字节缓冲流  字符缓冲流  转换流(乱码问题)
     * 对象序列化、反序列化(存储对象)  打印流(写什么打什么)
     */
    public static void main(String[] args) throws Exception {
        //byte[] getBytes() 使用平台默认的字符集（utf-8）将string编码为一系列字节，将结果存储的新的字节数组中
        String name = "中国超级牛逼5201314";
        byte[] bytes = name.getBytes();//默认utf-8
        System.out.println(bytes.length);//25
        System.out.println(Arrays.toString(bytes));//每三个负数表示一个汉字

        //指定字符集
        byte[] bytes1 = name.getBytes("GBK");//抛出异常
        System.out.println(bytes1.length);//19
        System.out.println(Arrays.toString(bytes1));//每两个负数一个汉字

        //解码，把字节转换成对应的中文形式  （编码前后的字符集必须一致）
        String rs = new String(bytes);
        System.out.println(rs);
        String rs1 = new String(bytes1, "GBK");
        System.out.println(rs1);
    }
}
