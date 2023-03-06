package com.liu.test;

import java.util.ArrayList;
import java.util.List;

//找出数组长度为n的数组里重复的数字（数字范围在0~n-1）
public class FindNum {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2,2,2,3,3,4,4,4};
        ArrayList<Integer> list = findNum2(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> findNum(int[] arr){
        //创建集合用于装重复的数字
        ArrayList<Integer> list = new ArrayList();
        //数组下标
        int i = 0;
        byte flag;
     while (true) {
         if(i > arr.length-1){
             break;
         }
         //m与i进行比较
         if (arr[i] == i) {
             flag = 1;
         } else {
             flag = 0;
         }
         switch (flag) {
             case 0:
                 if (arr[i] == arr[arr[i]]) {
                     list.add(arr[i]);
                     i++;
                 } else {
                     int temp = arr[i];
                     arr[i] = arr[temp];
                     arr[temp] = temp;
                 }
                 break;

             case 1:
                 i++;
                 break;

         }
     }
    return list;
    }

    //看了一遍书上的代码然后写一遍
    public static ArrayList<Integer> findNum2(int[] arr){
        //对数组进行判断，数组为空或者数组长度小于等于0直接返回
        if(arr == null || arr.length <= 0){
            System.out.println("错误1");
            return null;
        }
        //对数组里的数字进行判断
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0 || arr[i] > arr.length - 1){
                System.out.println("错误2");
                return null;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            while(arr[i] != i){
                if(arr[i] == arr[arr[i]]){
                    list.add(arr[i]);
                    break;
                }else{
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                }
            }
        }
        return list;
    }
}
//编写此次代码我感受到我在尽量的去避免if else的嵌套，然后根据逻辑在脑子里跟着走一遍代码
//然后发现问题并去解决，但是一开始脑子里并没有一个大概的框架，不能一下子想出该怎么去控制代码的执行流程，
//而是写一步看一步，最后好像是碰巧代码执行流程和逻辑流程一致，而且我想进行断点的调试，但是不会
//并且我一开始想用一个变量去记录一个经常变化且需使用的值，导致每一次变化我都需要去更新变量，十分的不便，
//直接用变化的角标去记录变化的值更好，代码的逻辑理解了，但是为什么这样变化就可以找出重复的值呢，首先是在前提
//数字在0~n-1之间，而数组的长度是n，意思如果数组没有重复的值的话，那么按序排列数组每一个arr[i]
// 的值刚好对应他的下标i,但是我发现一个bug就是如果我把数组全部设置为相同的值比如[2,2,2,2,2,2]，重复的数字
//只有2，输出应该是2，但是输出的是整个数组,对于出现两次以上的值，应该输出的值和实际输出的值会有偏差

