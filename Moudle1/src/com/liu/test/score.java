package com.liu.test;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入有几个裁判:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Scanf(arr);
        score(arr,n);

    }
    public static void score(int[] arr,int n)
    {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("最高分是:" + max);
        System.out.println("最低分是:" + min);
        result = (sum-max-min)*1.0/(arr.length-2);
        System.out.println("选手最终得分是:" + result);




    }
    public static void Scanf(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        int corse;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个裁判的打分");
            corse = sc.nextInt();
            arr[i] = corse;
        }
    }
}
