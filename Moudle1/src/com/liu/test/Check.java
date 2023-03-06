package com.liu.test;

public class Check {
    public static void main(String[] args) {
        int[] arr=new int[]{12,52,45,51,77};
        int index = numberIndex(51,arr);
        System.out.println("您查询的数据的索引为: "+index);
        System.out.println("--------------------------");
        System.out.println(numberIndex(51, arr));

    }
    public static int numberIndex(int n,int[] arr)
    {
        if (arr==null&&arr.length>0) {
            for (int i = 0; i < arr.length; i++) {
                if(n==arr[i])
                {
                    return i;
                }

            }

        }
        return -1;
    }
}
