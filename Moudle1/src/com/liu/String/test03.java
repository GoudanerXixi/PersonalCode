package com.liu.String;

public class test03 {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = {10, 20, 50, 60};
        int[] arr3 = {};
        System.out.println(toString(arr1));
        System.out.println(toString(arr2));
        System.out.println(toString(arr3));

    }
    public static String toString(int[] arr)
    {
        if(arr != null)
        {
            StringBuilder s = new StringBuilder("[");//只是拼接字符串的手段，效率好，最终还是要恢复成字符串类型
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i]).append(arr[i] == arr[arr.length-1]?"":",");
            }
            s.append("]");
            return s.toString();

        }
        else {
            return null;
        }

    }
}
