package com.liu.IoStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 用字符输入输出流拷贝一个文本文件
 */
public class copyFIleDemo3 {
    public static void main(String[] args) {
        try (//创建字符输入管道与源文件路径相通，读入内存
             Reader re = new FileReader("C:\\Users\\liuzongheng\\Desktop\\安装说明\\mysql安装.txt");
             //创建字符输出管道与目标文件路径相同，写到该文件
             Writer wr = new FileWriter("D:/code/mysql的安装.txt");){
            //创建字符数组（桶）每次读写多少数据
            char[] buffer = new char[10];
            int len;
            while((len = re.read(buffer)) != -1)
            {
                 wr.write(buffer, 0 , len);

            }
            System.out.println("老公你复制完成啦！");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
