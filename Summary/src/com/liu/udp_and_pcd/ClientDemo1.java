package com.liu.udp_and_pcd;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 发送端
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("===============客户端启动==============");
        //1.创建发送端对象：发送端自带默认的端口号  （人）
        DatagramSocket socket = new DatagramSocket(9999);

        //2.创建一个数据包对象封装数据   （韭菜盒子）
        /**
         *  public DatagramPacket(byte buf[], int length,
         *         InetAddress address, int port) {
         *             this(buf, 0, length, address, port);
         *         }
         *         1.byte buf[]  封装要发送的数据（韭菜）
         *         2.int length  发送数据的大小
         *         3.服务端主机的ip地址
         *         4.服务端的端口
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String str = sc.nextLine();
            byte[] buffer = str.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);
            if ("exit".equals(str)) {
                System.out.println("离线成功！");
                socket.close();
                break;
            }else{
                //3.发送数据出去
                socket.send(packet);
            }
        }
    }
}
