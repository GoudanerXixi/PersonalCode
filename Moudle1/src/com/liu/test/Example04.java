package com.liu.test;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个号码");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
