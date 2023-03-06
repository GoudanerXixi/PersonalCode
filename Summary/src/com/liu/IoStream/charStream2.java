package com.liu.IoStream;

import java.io.FileWriter;
import java.io.Writer;

public class charStream2 {
    /**
     * 字符输出流
     */
    public static void main(String[] args) throws Exception{
        //1.创建字符输出流管道与目标文件接通
        Writer w = new FileWriter("Summary/src/data04.txt");

        //2.写一个字符出去
        w.write('你');
        w.write('好');
        w.write('a');
        w.write(98);
        w.flush();

        //3.写一个字符串出去
        w.write("西西起床啦520");

        //4.写一个字符串的一部分出去
        w.write("狗蛋儿怎么老是和西西吵架呢",0,3 );

        //5.写一个字符数组出去
        char[] ch = {65,'你','爱','我'};
        char[] ch1 = "西西是我的女朋友".toCharArray();
        w.write(ch);
        w.write(ch1);
        w.flush();

        //6.写一个字符数组的一部分出去
        w.write(ch1,5,3);//女朋友
        w.flush();
    }
}
