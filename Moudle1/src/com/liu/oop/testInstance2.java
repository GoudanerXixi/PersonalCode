package com.liu.oop;

public class testInstance2 {

    public static void main(String[] args) {
    SingleInstance2 s2 = SingleInstance2.getInstance();
    SingleInstance2 s3 = SingleInstance2.getInstance();
        System.out.println(s2 == s3);


    }

}
