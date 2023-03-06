package com.liu.threadUse;

public class DepositThread extends Thread {
    private Account acc;

    public DepositThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }
    public DepositThread()
    {

    }

    @Override
    public void run() {
        try {
            while (true) {
                acc.depositThread(100000);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
