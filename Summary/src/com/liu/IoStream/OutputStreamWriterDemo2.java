package com.liu.IoStream;

import java.io.*;

/**
 * 字符转换输出流
 */
public class OutputStreamWriterDemo2 {
    public static void main(String[] args) throws Exception {
        //1.public OutputStreamWriter(OutputStream os, String charset)
        //可以指定编码把字节输出流转换成字符转换输出流，从而可以指定写出去的字符编码
        OutputStream ou = new FileOutputStream("D:/Information/转换流GBK.txt", true);

        Writer wr = new OutputStreamWriter(ou, "UTF-8");

        BufferedWriter bwr = new BufferedWriter(wr);

        bwr.write("我爱你中国");//乱码
        bwr.write("狗蛋儿和西西会在一起的，他们两个的缘分跑不掉");

        bwr.close();

    }
}
