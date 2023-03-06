package com.liu.dynamic_Proxy;

public class Star implements Skill{
    private String name;

    public Star(String name)
    {
        this.name = name;
    }
    @Override
    public void jump(){
        System.out.println(name + "在婀娜多姿的跳舞，好迷人~~");
    }
    @Override
    public void sing(){
        System.out.println(name + "在含情脉脉的歌唱~~");
    }
}
