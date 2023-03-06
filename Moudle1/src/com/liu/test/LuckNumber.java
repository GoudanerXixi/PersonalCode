package com.liu.test;

import java.util.Random;
import java.util.Scanner;

public class LuckNumber {
    public static void main(String[] args) {


        //随机生成一个1-100之间的整数
        Random sr = new Random();
        int LuckNumber = sr.nextInt(0,101) ;
        int Number;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1~100: ");
        while(true)
        {
            Number = sc.nextInt();
            if(Number>LuckNumber)
            {
                System.out.println("你输入的数字过大！");
            }
            else if(Number<LuckNumber)
            {
                System.out.println("你输入的数字过小！");
            }
            else {
                System.out.println("恭喜你猜中了，请到前台领取西西");
                break;
            }
        }

    }
}
