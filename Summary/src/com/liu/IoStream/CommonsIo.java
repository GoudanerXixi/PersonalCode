package com.liu.IoStream;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class CommonsIo {
    public static void main(String[] args) throws Exception {
        //1.复制文件到文件
//        IOUtils.copy(new FileInputStream("Summary\\src\\data01.txt"),
//                     new FileOutputStream("Summary\\src\\data06.txt"));

//       //2.完成文件复制到文件夹
//        FileUtils.copyFileToDirectory(new File("D:\\code\\javasepro\\Summary\\src\\chushibiao.txt"),
//                                      new File("D:\\Information"));
//
//        //3.完成文件夹复制到某个文件夹
//        FileUtils.copyDirectoryToDirectory(new File("D:\\Information"),
//                                           new File("D:\\Information01"));

          //4.删除文件夹
          FileUtils.deleteDirectory(new File(""));
    }
}
