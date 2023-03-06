package com.liu.oop;

import java.util.Scanner;

public class Test02{
    public static void main(String[] args) {
        Movice m1 = new Movice("长津湖","吴京",9.5);
        Movice m2 = new Movice("悬崖之上","刘浩存",9.0);
        Movice m3 = new Movice("泰坦尼克号","Rose",9.4);
        Movice[] arr = {m1, m2, m3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println("------------------------");
        }
        String okName = "liuzongheng";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = sc.next();
        if(okName.equals(name))
        {
            System.out.println("登录成功~~~");
        }
        else {
            System.out.println("登录失败");
        }
    }

}
class Movice{
    private String name;
    private String actor;
    private double score;

    public Movice() {
    }

    public Movice(String name, String actor, double score) {
        this.name = name;
        this.actor = actor;
        this.score = score;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "电影："+ name +"\n"+
                "演员："+ actor +"\n"+
                "得分："+ score;
    }
}
