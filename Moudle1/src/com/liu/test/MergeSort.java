package com.liu.test;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 12, 11, 17, 2, 8};
        msort(arr, 0, arr.length-1);
    }
    public static void msort(int[] arr, int left, int right){
        if (left < right) {
            int mid = (left + right) / 2; //以mid为界分成了两个数组
            msort(arr, left, mid);
            msort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

    }

    private static void merge(int[] arr, int left, int mid,  int right) {

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

