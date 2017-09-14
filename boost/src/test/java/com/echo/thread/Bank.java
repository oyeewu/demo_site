package com.echo.thread;

/**
 * Created by wumeng5 on 2017/9/11.
 */
public class Bank {

    public int mon = 0;

    public void addMoney() {
        synchronized (this) {
            mon += 1000;
            System.out.println(System.currentTimeMillis() + "存入1000");
            System.out.println("余额为" + mon);
        }
    }

    public void removeMoney() {
        synchronized (this) {
            if (mon < 1000) {
                System.out.println("余额不足!");
                System.out.println("余额为" + mon);
            } else {
                mon -= 1000;
                System.out.println(System.currentTimeMillis() + "取出1000");
                System.out.println("余额为" + mon);
            }
        }
    }

}
