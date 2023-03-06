package com.liu.abstractUse.foundation;

/**
 * 1.基本类型是值传递，传递的是数据值
 * 2.引用类型也是值传递，传递的是地址  引用数据类型（类（如String） 接口 数组 ）
 */

public class ValuePassing {
    public static void main(String[] args) {
        int a = 10;
        basicType(a);
        System.out.println(a);//数值不变，函数修改无效
        System.out.println("---------------------");
        Integer a1 = 10;
        basicType(a1);
        System.out.println(a1);//20
        System.out.println("---------------------");
        int[] arr = {1,3,5,7,8};
        printArray(arr);  //元素修改成功
        referenceType(arr);
        printArray(arr);




    }

    public static void basicType(int a) {
        System.out.println("传进来的值：" + a);
        a += 10;
        System.out.println("修改后的值：" + a);
    }


    public static void basicType(Integer a1) {
        System.out.println("传进来的值：" + a1);
        a1 += 10;
        System.out.println("修改后的值：" + a1);
    }

    public static void referenceType(int[] arr) {
        arr[1] = 100;      //修改数组第二个元素
        System.out.print("[");
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] == arr[arr.length - 1] ? arr[i] : arr[i] + ",");
            }
        }
        System.out.println("]");
    }
    public static void printArray(int[] arr)
    {
        System.out.print("[");
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] == arr[arr.length - 1] ? arr[i] : arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
