package com.liu.test;

import java.util.Random;
import java.util.Scanner;

public class createCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择随机生成几位验证码: ");
            int n = sc.nextInt();
            System.out.println("随机生成的验证码为: "+creareCOde(n));
            System.out.println("--------------------");
        }

    }
    public static String creareCOde(int n)
    {
        //随机输出n个验证码，包括大写字母、小写字母、数字
        Random r = new Random();
        String code = "";

        for (int i = 0; i < n; i++) {
            int k = r.nextInt(3); //随机生成0、1、2  // 0表示随机生成大写字母、1表示小写字母、2表示数字
            switch (k){
                case 0:
                    int c = r.nextInt(65,90);
                    code += (char)c;
                    break;

                    case 1:
                    int d = r.nextInt(97,122);
                    code += (char)d;
                    break;

                    case 2:
                    int e = r.nextInt(0,10);
                    code += e;
                    break;


            }
        }
        return code;

    }
}
