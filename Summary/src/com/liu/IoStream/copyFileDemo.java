package com.liu.IoStream;

import java.io.*;

/**
 * 完成文件的拷贝
 */
public class copyFileDemo {

    public static void main(String[] args) {
        InputStream i = null;
        OutputStream o = null;

        try {
            //1.创建一个字节输入管道与原视频接通
            i = new FileInputStream("C:\\Users\\liuzongheng\\" +
                    "Pictures\\Screenshots\\屏幕截图(122).png");
            //2.创建一个字节输出流管道与目标文件接通
            o = new FileOutputStream("D:/code/newphoto.png");
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
        //4.最优雅的关闭流
        finally {
            try {
                if (o != null) o.close();//防止i、o没接到管道之前发生异常，而自身是null而发生空指针异常
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (i != null) i.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
