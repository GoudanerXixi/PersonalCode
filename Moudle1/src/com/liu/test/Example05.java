package com.liu.test;

public class Example05 {
    public static void main(String[] args) {

    }
    public static void apart(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;
        int mid = (left + right)/2;
        if(left!=right)
        {
             right = mid;
        }
    }
}
