package com.liu.threadUse;

public class Account {
    //账户id
    private String Id_Card;
    //账户余额
    private double money;

    public Account() {
    }

    public Account(String id_Card, double money) {
        Id_Card = id_Card;
        this.money = money;
    }

    public String getId_Card() {
        return Id_Card;
    }

    public void setId_Card(String id_Card) {
        Id_Card = id_Card;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //小红小明取钱
    //五个人操作的同一个账户，全部都是用的一把锁
    //锁的范围是跨方法的
    public synchronized void drawThread(double money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money >= money){
                this.money -= money;
                System.out.println(name + "来取钱" + money + "!" + "取钱后的余额是：" + this.money);
                //唤醒别人，挂起自己
                this.notifyAll();
                this.wait();
            }
            else{
                //没钱不取钱
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //三个爸爸来存钱
    public synchronized void depositThread(double money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money == 0){
                this.money += money;
                System.out.println(name + "来存钱" + money + "!" + "存钱后的余额是：" + this.money);
                //唤醒别人，挂起自己
                this.notifyAll();
                this.wait();
            }
            else{
                //有钱不存钱
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
