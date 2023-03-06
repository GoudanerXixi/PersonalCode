package com.liu.fileUse;

import java.io.File;

public class FileDemo01 {
    /**
     * File的作用：创建对象定位文件，可以删除获取文件信息等。但不能读写文件内容
     * @param args
     */
    public static void main(String[] args) {
        //1.创建File对象,File封装的对象是一个路径名，可以存在也可以不存在
        File f = new File("D:\\code\\测试.txt");//绝对路径
        File f1 = new File("D:/code/测试.txt");//双反斜杠 单正斜杠都可以
        File f2 = new File("D:"+File.separator+"code"+File.separator+"测试.txt");
        long size = f.length();//文件的字节数大小
        long size1 = f1.length();
        long size2 = f2.length();
        System.out.println(size);
        System.out.println(size1);
        System.out.println(size2);

        //2.支持绝对路径和相对路径
        File f3 = new File("Summary/src/data.txt");//相对路径一般定位模块中的文件。 相对到工程下
        System.out.println(f3.length());//9个字节

        //File创建的对象可以是文件也可以是文件夹
        File f4 = new File("D:/code");
        System.out.println(f4.length());//拿不到文件夹的大小
        //判断文件夹是否存在public boolean exists();
        System.out.println(f4.exists());//true

    }
}
