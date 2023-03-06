package com.liu.test;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;
import java.util.Scanner;

public class twoColorBall {
    static {
        int a = 7;
        int b = 2;
        int c = a / b;
        System.out.println("c的值为：" + c);
    }
    public static void main(String[] args) {
        int[] userNumber = userNumber();

        int [] luckNumber = luckNumber();

        judge(userNumber,luckNumber);
    }
    //随机产生六个1~33之间的号码（不重复）和一个1~16之间的号码
    public static int[] luckNumber()
    {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length-1; i++) {

            while (true) {
                int data = r.nextInt(1,34);
                boolean flag = true;
                for(int j = 0; j < i ; j++)//第i个数字总会与前面i-1个数字对比，若相同通过while重新生成，否则录入数据
                {
                    if(arr[j]==data) {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    arr[i]=data;
                    break;
                }
            }

        }
        arr[arr.length-1] = r.nextInt(1,17);
        return arr;
    }
    //用户输入猜测号码
    public static int[] userNumber()
    {
        int[] arr1 = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length-1; i++) {
            System.out.println("请输入你猜测的第" +(i + 1) + "个红球号码(1~33不重复):");
            arr1[i] = sc.nextInt();
        }
        System.out.println("请输入你猜测的蓝球号码(1~16):");
        arr1[arr1.length-1] = sc.nextInt();
        return arr1;
    }

    //中将情况说明
    public static void judge(int[] userNumber,int[] luckNumber)
    {
        int red = 0;
        int blue = 0;
        for (int i = 0; i < userNumber.length-1; i++) {
            for (int j = 0; j < luckNumber.length-1; j++) {
               if(userNumber[i]==luckNumber[j])
               {
                   red++;
                   break;
               }
            }
        }
        blue = userNumber[userNumber.length-1] == luckNumber[luckNumber.length-1]?1:0;
        if(blue==1 && (red==0||red==1))
        {
            System.out.println("恭喜你中了六等奖，奖金5元");
        }
        else if((blue==1 && red==2||red==3) || red==4)
        {
            
            System.out.println("恭喜你中了五等奖，奖金10元");
        } else if (red==4 && blue==1 || red==5) {
            System.out.println("恭喜你中了四等奖，奖金200元");
        } else if (red==5 && blue==1) {
            System.out.println("恭喜你中了三等奖，奖金300元");

        } else if (red==6 && blue==0) {
            System.out.println("恭喜你中了二等大奖，奖金为500w元");


        } else if (red==6 && blue==1) {
            System.out.println("恭喜你中了超级大奖，奖金1000w元，请你尽情享受人生！！！");

        }
        else{
            System.out.println("您未中奖，谢谢你为彩票公益做出的贡献");
        }
        System.out.println("您猜测的号码为:");
        Print(userNumber);
        System.out.println();
        System.out.println("中奖号码为:");
        Print(luckNumber);
        System.out.println();
        System.out.println("您猜中的红球个数为:"+red);
        System.out.println();
        System.out.println("您是否猜中蓝球:"+(blue==1?"是":"否"));
        System.out.println("------------------------------------");


    }
    public static void Print(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");

        }
    }
}
