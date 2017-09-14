package com.echo.thread;

/**
 * Created by wumeng5 on 2017/9/11.
 */
public class MoneyTest {

    public static void main(String[] args) {
        final Bank2 bank = new Bank2();

        Thread addThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bank.addMoney();
                }
            }
        });

        Thread removeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    bank.removeMoney();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        removeThread.start();
        addThread.start();
    }
}
