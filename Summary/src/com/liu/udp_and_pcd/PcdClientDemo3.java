package com.liu.udp_and_pcd;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * PCD客服端
 */
public class PcdClientDemo3 {
    public static void main(String[] args) {
        //1.创建Socket通信管道请求服务端的链接
        //public Socket(String host, int port)
        //参数一：服务端的ip地址
        //参数二：服务端的端口

        try {
            Socket socket = new Socket("172.20.10.3", 9999);

            //2.从Socket中得到一个字节输出流，负责发送数据
            OutputStream os = socket.getOutputStream();

            //3.把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);

            //4.发送消息
            ps.println("西西在干嘛呢？约吗");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
