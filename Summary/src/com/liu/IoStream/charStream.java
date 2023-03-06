package com.liu.IoStream;

import java.io.FileReader;
import java.io.Reader;

public class charStream {
    /**
     * 字符输入流
     */
    public static void main(String[] args) throws Exception {
        //1.创建字符输入管道，与源文件对象/路径 相通
        Reader re = new FileReader("Summary\\src\\data03.txt");

        //读取一个字符
//        int a = re.read();
//        System.out.print((char) a);
//        int a1 = re.read();
//        System.out.print((char) a1);
//        int a2 = re.read();
//        System.out.print((char) a2);
//        int a3 = re.read();
//        System.out.print((char) a3); //我第一行只有三个字符，单次读第四个没有换行读不到数据
//        //循环读取单个字符不会读不到
//        int len;
//        while ((len = re.read()) != -1)
//        {
//            System.out.print((char) len);
//        }

        //读取一个字符数组
//        char[] buffer = new char[3];//一次读三个字符
//        String s = new String(buffer);
//        System.out.print(s);

        //循环读取字符数组
        char[] buffers = new char[10];
        int lens;
        while((lens = re.read(buffers)) != -1)
        {
            String ss = new String(buffers, 0 ,lens);
            System.out.print(ss);
        }
    }
}
