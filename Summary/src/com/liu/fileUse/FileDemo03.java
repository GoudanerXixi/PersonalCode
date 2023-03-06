package com.liu.fileUse;

import java.io.File;

/**
 * 创建删除文件
 * 执行一次后结果会变因为文件已经创建或者删除成功
 */
public class FileDemo03 {
    public static void main(String[] args) throws Exception {
        //1.创建新的空文件夹,成功返回true,反之，几乎不用以后文件都是自动创建
        File f = new File("Summary/src/dara02.txt");
        System.out.println(f.createNewFile());//true

        //2.创建一级文件夹
        File f2 = new File("D:/code/测试02.txt");
        System.out.println(f2.mkdir());//true

        //3.创建多级文件夹
        File f3 = new File("D:/code/data02/aaa/bbb");
        System.out.println(f3.mkdirs());//true

        //4.删除文件，直接删除不走回收站，只能删除文件或者空文件夹
        System.out.println(f.delete());//true
        System.out.println(f2.delete());//true
        File f4 = new File("D:/code/data02");
        System.out.println(f4.delete());//false 多级空目录也只能删除最后一层空目录，因为那些空目录在上一层看来也是内容
        System.out.println(f3.delete());


    }
}
