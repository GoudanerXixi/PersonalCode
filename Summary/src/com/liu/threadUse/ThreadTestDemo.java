package com.liu.threadUse;

import java.util.ArrayList;
import java.util.List;

/**
 * 了解线程通信，一般通过共享一个数据的方式实现
 * 3个爸爸存钱(生产者)，两个孩子取钱(消费者)，实现一存一取
 */
public class ThreadTestDemo {
    public static void main(String[] args) {
        //1.创建账户对象，代表五个人共同操作的账户
        Account acc = new Account("xixi",0);
        //2.三个存钱线程
        new DepositThread(acc, "亲爸").start();
        new DepositThread(acc, "干爹").start();
        new DepositThread(acc, "岳父").start();
        //3.两个取钱线程
        new DrawThread(acc, "小红").start();
        new DrawThread(acc, "小明").start();
        String s = "你好！";
        List<Integer> list = new ArrayList<>();
    }
}
