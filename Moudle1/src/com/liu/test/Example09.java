package com.liu.test;

public class Example09 {
    public static int LastTotalNumber;//购买的啤酒数量
    public static int LastCoverNumber;//剩余的啤酒盖数量
    public static int LastBottleNumber;//剩余的啤酒瓶数量
    //两块钱一瓶啤酒  四个啤酒盖可以换一瓶啤酒  两个啤酒瓶一瓶啤酒
    public static void main(String[] args) {
        buy(10);
        System.out.println("啤酒数量：" + LastTotalNumber);
        System.out.println("剩余啤酒盖数量：" + LastCoverNumber);
        System.out.println("剩余啤酒瓶数量：" + LastBottleNumber);

    }
    public static void buy(int money)//非规律化递归
    {
        int totalNumber = money/2;//一开始的钱能买的啤酒瓶数
        LastTotalNumber += totalNumber;//买的啤酒数量
        int coverNumber = LastCoverNumber + totalNumber;//此时的啤酒盖数量
        int bottleNumber = LastBottleNumber + totalNumber;//此时的啤酒瓶数量
        int allmoney = 0;//把啤酒瓶和盖换成钱，初始为零
        if(coverNumber >= 4)
        {
            allmoney += (coverNumber / 4) * 2;//把所有的啤酒盖子换成钱
        }
            LastCoverNumber = coverNumber % 4;
        if(bottleNumber >= 2)
        {
            allmoney += (bottleNumber / 2) * 2;//不可省略因为除以二可能小数部分被抹去了
        }
            LastBottleNumber = bottleNumber % 2;
        if (allmoney >= 2) {
            buy(allmoney);
        }
    }
}
