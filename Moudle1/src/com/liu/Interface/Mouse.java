package com.liu.Interface;

public class Mouse implements USB{
   private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public Mouse() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void insert() {
        System.out.println(name + "插入成功");

    }

    @Override
    public void pull() {
        System.out.println(name + "拔出成功");

    }
    public void click()
    {
        System.out.println(name + "双击评论666，我的宝贝");
    }
}
