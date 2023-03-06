package com.liu.commonclasses;

/**
 * 用StringBuilder打印数组
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        int[] arr = {4,8,3,4,6};
        System.out.println(toString(arr));

    }
    public static String toString(int[] arr) {
        if (arr != null) {
            StringBuilder s = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i] == arr[arr.length - 1] ? arr[i] : arr[i] + ",");
            }
            s.append("]");
            return s.toString();
        }
        else {
            return null;
        }


    }
}
