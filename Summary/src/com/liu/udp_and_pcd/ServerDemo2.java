package com.liu.udp_and_pcd;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=================服务端启动=================");
        //创建接收端对象：注册端口 （人）
        DatagramSocket socket = new DatagramSocket(8888);

        byte[] buffer = new byte[1024 * 8];
        while (true) {
            //创建数据接受对象  （空韭菜盘子）
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            //3.等待接收数据
            socket.receive(packet);

            int len = packet.getLength();

            //4.取出数据即可
            String str = new String(buffer, 0, len);

            //5.获取对方的ip和端口
            String ip = packet.getSocketAddress().toString();

            int port = packet.getPort();

            System.out.println("收到了：" + "来自" + "ip是" + ip + "端口是" + port + "发送的：" + str);

        }
    }
}
