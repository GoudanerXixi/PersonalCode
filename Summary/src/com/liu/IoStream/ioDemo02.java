package com.liu.IoStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * IO流
 * 按方向分：输入流 输出流   按流中的数据最小单位分：字节流（操作所有类型的文件）  字符流（只能操作纯文本文件）
 * 字节输入流：以内存为基准，来自磁盘/网络中的数据已字节的形式读入到内存中去的流称为字节输入流
 * 字节输出流：以内存为基准，把内存中的数据以字节写出到磁盘文件或者网络中去的流称为字节输出流
 * 字符输入流：以内存为基准，来自磁盘/网络中的数据已字符的形式读入到内存中去的流称为字符输入流
 * 字符输出流：以内存为基准，把内存中的数据以字符写出到磁盘文件或者网络介质中去的流称为字符输出流
 */
public class ioDemo02 {
    /**
     * 字节输入流
     */
    public static void main(String[] args) throws Exception {
        //public FileIuputStream(File file)创建字节输入流管道与源文件对象接通
        //public FileInputStream(String pathname)创建字节输入流管道与源文件路径接通
        //InputStream in = new FileInputStream(new File("Summary/src/data.txt"));
        InputStream in = new FileInputStream("Summary/src/data.txt");

        //public int read()每次读取一个字节返回，如果字节已经没有可读的返回-1
//        int a;
//        while((a = in.read()) != -1)
//        {
//            System.out.print((char)a);
//        }
        System.out.println();
        System.out.println("---------------------");//前面已经全部读入内存，所以无法再读
        //public int read(byte[] buffer)每次读取一个字节数组返回，如果字节已经没有可读的返回-1
        byte[] buffer = new byte[3];
 //       int len = in.read(buffer);
//        System.out.println("一次读取了" + len + "个字节");
//        String str = new String(buffer);
//        System.out.println(str);
        int len;
        while((len = in.read(buffer)) != -1)//八个字节每次读三个，133aad22
                                            //                133 aad 22d最后一个无法填充完
        {
            String str = new String(buffer, 0, len); //读多少倒出多少，最后只读了两个字节，所以len = 2，所以刚好读完
            //String str = new String(buffer);
            System.out.println(str);
        }
        System.out.println("----------------------");
        //如果想读的中文不乱码，可以把桶设置大一点一次全部读完全部字节，但文件过大字节数组可能引起内存溢出
        File files = new File("Summary/src/data01.txt");
        InputStream inp = new FileInputStream(files);
        //byte[] buffers = new byte[(int)files.length()];
        byte[] buffers = inp.readAllBytes();
        int lens = inp.read(buffers);
        System.out.println("读取了多少个字节" + lens);
        System.out.println("文件大小" + files.length());
        System.out.println(new String(buffers));


    }
}
