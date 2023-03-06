package com.liu.IoStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class charBufferedStreamcopyFile {
    /**
     * 用字符缓冲流拷贝打乱得的出师表
     */
    public static void main(String[] args) {

        try (//1.定义一个缓冲字符输入流管道与源文件路径接通
             Reader re = new FileReader("Summary/src/chushibiao.txt");
             BufferedReader bre = new BufferedReader(re);
             //2.定义一个缓冲字符输出管道与目标文件接通
             Writer wr = new FileWriter("D:/code/出师表.txt");
             BufferedWriter bwr = new BufferedWriter(wr);) {


            //3.定义一个List集合存储每一行数据
            List<String> list = new ArrayList<>();

            //4.定义一个循环按行读取数据，存入到List集合中去
            String line;
            while ((line = bre.readLine()) != null)//一行一行的读,是BuffersdReader独有的方法所以不用多态写
            {
                list.add(line);
            }

            //5.对List中的每行数据按照首字符编号升序排序
            Collections.sort(list);


            //6.遍历List集合中的每个元素，用缓冲输出管带写出并换行
            for (int i = 0; i < list.size(); i++) {
                bwr.write(list.get(i));
                bwr.newLine();
            }
            System.out.println("主人你已经复制完成啦!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
