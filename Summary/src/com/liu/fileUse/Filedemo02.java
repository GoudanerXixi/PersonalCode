package com.liu.fileUse;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 文件常用API 创建删除文件 文件的遍历
 */
public class Filedemo02 {
    public static void main(String[] args) {
        File f1 = new File("D:/code/测试.txt");
        //1.获取文件的绝对路径
        System.out.println(f1.getAbsolutePath());

        //获取文件定义的时候使用的路径
        System.out.println(f1.getPath());

        //获取文件的名称带后缀
        System.out.println(f1.getName());

        //获取文件的字节数大小
        System.out.println(f1.length());

        //获取文件最后的修改时间
        long time = f1.lastModified();
        System.out.println("最后修改的时间为：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

        //判断File是否存在
        System.out.println(f1.exists());//true
        //判断是否为文件
        System.out.println(f1.isFile());//true
        //判断是否为文件夹
        System.out.println(f1.isDirectory());//false
    }
}
