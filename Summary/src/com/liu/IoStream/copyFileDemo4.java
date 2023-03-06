package com.liu.IoStream;

import java.io.*;

/**
 * 字节缓冲输入流，字节缓冲输出流
 * 最快的拷贝
 */
public class copyFileDemo4 {
    private static final String SRC_FILE = "";
    private static final String DEST_FILE = "";

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try (//1.创建字节输入流管道与源文件路径接通
             InputStream is = new FileInputStream(SRC_FILE);
             //2.使用字节缓冲输入流包装
             InputStream bis = new BufferedInputStream(is);
             //3.创建字节输出流与目标文件路径接通
             OutputStream os = new FileOutputStream(DEST_FILE);
             //4.创建字节缓冲输出流包装
             OutputStream bos = new BufferedOutputStream(os);){
            //设置桶
            byte[] buffer = new byte[1024];//1k1k的倒
            int len;
            while((len = bis.read(buffer)) != -1)
            {
                bos.write(buffer, 0, len);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制成功，主人你复制该文件花费了：" + (endTime - startTime) / 1000.0 + "s");
    }
}


