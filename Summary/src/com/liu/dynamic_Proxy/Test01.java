package com.liu.dynamic_Proxy;

public class Test01 {
    public static void main(String[] args) {
        Star s = new Star("杨超越");
        Skill skill = StarProxy.getSkill(s);
        skill.jump();
        System.out.println("=========================");
        skill.sing();

    }
}
