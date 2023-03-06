package com.liu.test;

import java.util.Random;
import java.util.Scanner;

public class LuckNumber2 {
    public static void main(String[] args) {
        //1.生成五个随机数,用数组存取
        int []arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(0,21);
        }
        //2.定义一个死循环，让用户输入数字与随机数比较
        Scanner sc = new Scanner(System.in);
        OUT:
        while(true)
        {
            System.out.println("请输入数字(0~20): ");
            int Guess = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == Guess)
                {
                    System.out.println("恭喜你对了第"+(i+1)+"个数字");
                    break OUT;
                }

            }
        }



    }
}
