package com.liu.test;

import com.liu.util.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BUbble {
    public static void main(String[] args) throws ParseException {
//        int[] arr = new int[8];
//        Util.scanfArray(arr);
//        Util.bubbleSort(arr);
//        Util.printArray(arr);
//        String name = "西西";
//        String name1 = new String("狗蛋儿");
//        String name2 = new String("");
//        System.out.println(name);
//        System.out.println(name1);
//        System.out.println(name2);
       //基本的数据类型转换为字符串，没啥用
        Integer i = 21;
        String s = i.toString();
        System.out.println(s + 2);//212

        String s1 = Integer.toString(i);
        System.out.println(s + 2);//212

        //将字符串转换为基本的数据类型，很有用
        String s2 = "22";
        int age = Integer.valueOf(s2);
        System.out.println(age + 1);//23

        double d = Double.valueOf(s2);
        System.out.println(d + 1.0);//23.0

        Date data= new Date();
        //当前系统的此刻日期时间对象
        System.out.println(data);

        //获取当前的时间毫秒值
        long time = data.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());

        //格式化日期对象
        SimpleDateFormat adf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String str = adf.format(data);
        String str1 = adf.format(time);
        System.out.println(str);
        System.out.println(str1);

//        解析时间
        SimpleDateFormat adf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s3 = "2022年12月15日 21:21:12";
        String s4 = "2022年10月16日 12:21:12";
        String s5 = "2022年05月05日 18:21:12";
        Date d1 = adf1.parse(s3);
        Date d2 = adf1.parse(s4);
        Date d3 = adf1.parse(s5);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


    }
}
class Sort{
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,4,6};
        selectSort(arr);
        Util.printArray(arr);
        System.out.println(two(arr, 4));

    }
    public static int[] selectSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            //[1,5,7,3,4,6]
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }


            }

        }
            return arr;
    }
    public static int two(int[] arr,int data)//二分查找，针对的是已经排好顺序的数组
    {
        int left = 0;
        int right = arr.length-1;
        while (left <= right)
        {
            int mid = (left + right)/2;
            if(data>arr[mid])
            {
                left = mid+1;
            }
            else if(data<arr[mid])
            {
                right = mid-1;
            }
            else{
                return mid;
            }
        }
            return -1;
    }

}