package com.liu.test;

import java.util.Random;

/**
 * 快速排序
 * 9 5 12 11 17 2 8
 * 8 2 5  9  12 11 17            选第一个作为标记小的往左边跑，大的往右边跑
 * {   5 2 8  }   9  {11 12 17}  三个数字一个跑左一个跑右就不用排了  都跑一边再排一遍
 * {2 5 8}  排序完成
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(0,9999999);
        }
        long startTime = System.currentTimeMillis();
        quictSort(arr, 0, 9999999);
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("排序花费时间(毫秒)：");
        System.out.println(endTime);


    }

    public static int quictSortMid(int[] arr, int left, int right) {

        //存储选取的中间值的值，此时可理解为arr[left]为空
        int pivot = arr[left];
        //左边向右扫描，右边向左扫描，当退出循环，也就是左边等于右边，把pivot填进去完成第一次快排
        while (left < right) {
            //右边比pivot都大一直往左边扫描，直到找到比pivot小的退出该循环
            while (arr[right] >= pivot && left < right) {
                right--;
            }
            //把小的值复制给arr[left],此时右边arr[right]可理解为空，开始左边扫描
            arr[left] = arr[right];
            if (left < right) {
                //此时arr[left]，为右边找的小的填过来的肯定<=pivot，可直接跳过不用扫描
                left++;
            }


            while (arr[left] <= pivot && left < right) {
                left++;
            }
            //此时可理解为左边为空，再次开始右边扫描
            arr[right] = arr[left];
            if (left < right) {
                //此时arr[right]是左边找的大的填过来的，肯定>=pivot,可直接跳过不用扫描,但是最后一次相等的时候不用执行
                right--;
            }
        }
        //此时 left = right，把pivot放在中间的分割位置，完成一次快排
        arr[left] = pivot;

        //记录此时中间值的索引
        return left;

    }

    public static void quictSort(int[] arr, int left, int right) {
        if (left < right) {
            int pos = quictSortMid(arr, left, right);
            quictSort(arr, left, pos - 1);
            quictSort(arr, pos + 1, right);
        }
    }

    public static void printArray(int[] arr) {
        if (arr != null) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] == arr[arr.length - 1] ? arr[i] : arr[i] + ", ");
            }
            System.out.println("]");
        }
    }
}
