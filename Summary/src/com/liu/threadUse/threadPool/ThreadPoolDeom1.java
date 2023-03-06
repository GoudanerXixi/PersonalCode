package com.liu.threadUse.threadPool;

import java.util.concurrent.*;

/**
 * 创建线程池：就是可以复用线程的技术
 * 线程池只接收Runnable 和 Callable 任务
 * 什么时候创建临时线程：  1.核心线程都在忙   2.任务队列也满了   3.可以创建临时线程  此时才会创建临时线程
 * 谁代表线程池：  ExecutorService接口
 */
public class ThreadPoolDeom1 {
    public static void main(String[] args) {
        /**
         *     public ThreadPoolExecutor(int corePoolSize,
         *                               int maximumPoolSize,
         *                               long keepAliveTime,
         *                               TimeUnit unit,
         *                               BlockingQueue<Runnable> workQueue,
         *                               ThreadFactory threadFactory,
         *                               RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                                                       new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                                                        new ThreadPoolExecutor.AbortPolicy());

        Runnable target  = new MyRunnable(100);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //创建临时线程
        pool.execute(target);
        pool.execute(target);

        //不创建线程拒绝策略触发
        pool.execute(target);

        //pool.shutdownNow();  //立即关闭即使任务没有完成，会丢失任务
        pool.shutdown();  //会等待全部任务执行完之后再关闭
    }
}

class MyRunnable implements Runnable{
    private int n;
    public MyRunnable(int n){
        this.n = n;
    }
    @Override
    public void run() {

            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum += i;

        }
            System.out.println(Thread.currentThread().getName()+"处理的"+"1~" + this.n + "的和是：" + sum);
        }
    }



