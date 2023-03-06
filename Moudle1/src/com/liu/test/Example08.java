package com.liu.test;

/**  recursion
 * 1.什么是递归:递归就是方法方法直接或间接调用自己的形式称为方法递归
 * 2.递归的形式
 * 2.1直接递归：方法自己调用自己
 * 2.2方法调用其他方法其他方法又调回自己
 * 3.递归如果没有控制好终止，会出现递归死循环，导致栈内存溢出现象
 * 递归的解题思路就是把一个复杂的问题层层转换成一个与原问题相似规模较小的问题来解决
 *
 * 递归的三要素：1.递归的公式  2.递归的终结点  3.递归的方向必须走向终结点
 */
public class Example08 {
    public static void main(String[] args) {
        System.out.println(f(10));

    }
    public static int f(int n)//规律化递归
    {
        if(n == 1)
        {
            return 1;
        }
        else {
            return  f(n - 1) * 2 + 2;
        }
    }
}
