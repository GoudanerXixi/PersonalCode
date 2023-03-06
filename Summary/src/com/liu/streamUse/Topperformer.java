package com.liu.streamUse;

public class Topperformer {
    private String name;
    public double money;

    public Topperformer(String name, double money) {
        this.name = name;
        this.money = money;
    }
    public Topperformer(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Topperformer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
