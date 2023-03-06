package com.liu.IoStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ioDemo03 {
    /**
     * 字节输出流
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //public FileOutputStream(File file) 创建字节输出流管道与源文件对象接通
        //public FileOutputStream(File file, boolean append) 创建字节输出流管道与源文件对象接通,可追加数据
        //public FileOutputStream(String filepath) 创建字节输出流管道与源文路径接通
        //public FileOutputStream(String filepath, boolean append) 创建字节输出流管道与源文件路径接通，可追加数据
        File f = new File("Summary/src/data03.txt");
        OutputStream o = new FileOutputStream(f);//先清空之前的数据，再写入新数据  后面追加个true就不会清空
        //OutputStream o = new FileOutputStream(f, true);
        //public void write(int a) 写一个字节出去
        o.write(99);//c
        o.write('a');
        o.write('d');
        o.write("\r\n".getBytes());//换行
        //o.write('刘');//会乱码，只会写出刘的一个字节[ooo]

        //public void write(byte[] buffer) 写一个字节数组出去
        byte[] bytes = {99,100,70,'s'};
        o.write(bytes);
        o.write("\r\n".getBytes());
        byte[] bytes1 = "西西最爱狗蛋儿".getBytes();
        o.write(bytes1);
        o.write("\r\n".getBytes());

        //public void write(byte[] buffer, int pos, int len) 写一个字节数组的一部分出去
        byte[] bytes2 = {112,65,66,67};
        o.write(bytes2,0, 4);
        o.write("\r\n".getBytes());
        o.close();
        //flush() 刷新流，还可以继续写数据  close() 关闭流，释放资源，关闭之前会先刷新流。一旦关闭就不能再写数据
    }
}
