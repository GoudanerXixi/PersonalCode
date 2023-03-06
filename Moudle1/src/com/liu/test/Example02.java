package com.liu.test;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请问今天是星期几？");
        String name = sc.next();
        switch(name){
            case "星期一":
                System.out.println("和西西出去玩");
                break;
            case "星期二":
                System.out.println("和西西吃烧烤");
                break;
            case "星期三":
                System.out.println("和西西玩游戏");
                break;
            case "星期四":
                System.out.println("和西西看电视");
                break;
            case "星期五":
                System.out.println("和西西打台球");
                break;
            case "星期六":
                System.out.println("揍西西一顿");
                break;
            case "星期天":
                System.out.println("kiss kiss");
                break;
            default:
                System.out.println("你输入的数据有误");
                break;

        }
    }
}
