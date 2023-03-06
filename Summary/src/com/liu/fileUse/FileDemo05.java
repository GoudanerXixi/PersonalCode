package com.liu.fileUse;

import java.io.File;


/**
 * 文件搜索
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File file = new File("D:/");
        long startTime =  System.currentTimeMillis();

        try {
            searchFile(file, "测试.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("查询时间：" + (endTime - startTime) + "毫秒");


    }
    public static void searchFile(File dir, String fileName){
        if(dir != null && dir.isDirectory())
        //可以开始查找了
        {
             File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    if(file.isFile())
                    {
                        if(file.getName().contains(fileName)){

                            System.out.println("恭喜你找到我啦" + file);
                        }

                    }
                    else{
                        searchFile(file,fileName);//说明是文件夹继续递归寻找
                    }
                }
            }
        }
        else{
            System.out.println("请传入正确的文件夹");
        }

    }
}
