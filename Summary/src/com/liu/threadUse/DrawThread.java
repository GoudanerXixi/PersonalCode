package com.liu.threadUse;

/**
 *  用于取钱
 */
public class DrawThread extends Thread{

    //接账户对象
    private Account acc;

    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }

    public DrawThread()
    {

    }
    //重写取钱
    @Override
    public void run() {
        while (true) {
            try {
                acc.drawThread(100000);
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
