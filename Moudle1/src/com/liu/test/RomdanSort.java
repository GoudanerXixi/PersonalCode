package com.liu.test;

import java.util.Random;
import java.util.Scanner;

public class RomdanSort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入原数据： ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int index;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
           index = r.nextInt(0,n);
           int temp = arr[index];
           arr[index] = arr[i];
           arr[i] = temp;

        }
        System.out.println("随机排序为： ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}