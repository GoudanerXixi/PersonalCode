package com.liu.IoStream;

import java.io.*;

/**
 * 完成文件的拷贝
 * 资源都是实现了Closeable/AutoCloseableji接口的类对象
 */
public class copyFileDemo2 {

    public static void main(String[] args) {


        try (   //这里面只能放资源对象，用完会自动关闭：自动调用资源对象的closa方法关闭资源（即使出现异常也会关闭操作）
                //1.创建一个字节输入管道与原视频接通
                InputStream i = new FileInputStream("C:\\Users\\liuzongheng\\" +
                        "Pictures\\Screenshots\\屏幕截图(122).png");
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream o = new FileOutputStream("D:/code/newphoto.png");) {


            //3.定义一个字节数字转移数据
            byte[] buffer = new byte[16];
            int len;
            while ((len = i.read(buffer)) != -1) {
                o.write(buffer, 0, len);
            }
            System.out.println("复制完成");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

