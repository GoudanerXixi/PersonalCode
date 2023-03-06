package com.liu.Interface;

public class Keyboard implements USB{
   private String name;
    @Override
    public void insert() {
        System.out.println(name + "链接成功");

    }

    public String getName() {
        return name;
    }

    public Keyboard() {
    }

    public Keyboard(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void pull() {
        System.out.println(name + "拔出成功666");

    }
    public void rap()
    {
        System.out.println(name + "敲出西西喜欢狗蛋儿");
    }
}
