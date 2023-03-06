package com.liu.fileUse;

import java.io.File;

/**
 * 文件的遍历
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File f = new File("D:/code");
        //1.public String[] list() //获取当前目录下所有一级文件 名称 到字符串数组中去
        String[] str = f.list();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("---------------------");
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println("--------------------");

        //2.public File[] listFiles()//获取当前目录下所有的一级文件 对象 到一个文件对象数组中去返回（重点）
        File f1 = new File("D:/applications");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);//file.getAbsolutePath()
        }

        /**
         * listFiles方法注意事项
         * 1.当调用者不存在时，返回null
         * 2.当调用者是一个文件时返回null
         * 3.当调用者是一个空文件夹时返回一个长度为0的数组
         * 4.当调用者是一个有内容的文件夹时，将里面所有的文件和文件夹的路径放在File数组中返回，包含隐藏内容
         * 5.当调用者是一个有隐藏文件的文件夹时，将里面所有的文件和文件夹的路径放在File数组中返回，包含隐藏内容
         */

    }
}
