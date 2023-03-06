package com.liu.udp_and_pcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * PCD服务端
 */
public class PcdServerDemo4 {
    public static void main(String[] args) {
        //1.注册端口
        try {
            ServerSocket serverSocket = new ServerSocket(9999);

            //2.必须调用accept方法：等待客服端的Socket连接请求，建立Socket通信管道
            Socket socket = serverSocket.accept();

            //3.从Socket管道中得到一个字节输入流
            InputStream in = socket.getInputStream();

            //4.把字节输入流包装成缓冲字符输入流
            BufferedReader bu = new BufferedReader(new InputStreamReader(in));

            //5.按照行读取消息
            String str;
            if((str = bu.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() + "发来了：" + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
