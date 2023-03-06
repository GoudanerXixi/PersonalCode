package com.liu.threadUse;

import java.util.concurrent.Callable;

import java.util.concurrent.FutureTask;

public class ThreadDemo1 {
    /**
     *多线程的创建方式
     */
    public static void main(String[] args) {
        //3.创建Callable任务对象
        Callable<String> call = new MyCallable(100);
        //4.把Callable任务对象 交给 FutureTask 对象
        //FutereTask的作用1：是Runnable的对象（实现Runnable接口），可以交给Thread了
        //FutereTask的作用2：可以在线程执行完毕之后通过调用get方法得到线程执行完成的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        //5.交给线程处理
        Thread t = new Thread(f1);
        //6.启动线程
        t.start();
        try {
            String st = f1.get();
            System.out.println("第一个" + st);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        Thread t2 = new Thread(f2);
        t2.start();
        try {
            String st = f2.get();
            System.out.println("第二个" + st);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
//定义一个任务类实现callable接口，应该申明线程任务执行完毕后的结果的数据类型
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }
    //重写call方法
    @Override
    public String call() throws Exception {
           int sum = 0;
           for(int i = 1; i<=n; i++){
               sum += i;
           }
           return "子线程执行的结果是：" + sum;
    }
}
