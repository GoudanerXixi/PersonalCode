package com.liu.util;

import java.util.Scanner;

/**
 * 我的私人工具包
 */

public class Util {
    //1.冒泡排序
    public static int[] bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }
        }
        return arr;
    }

    //打印数组
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");

        }
    }

    //输入数组
    public static void scanfArray(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
        }
    }

}
