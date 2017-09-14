package com.echo.thread;

/**
 * Created by wumeng5 on 2017/9/11.
 */
public class Bank2 {

    public ThreadLocal<Integer> threadLocal = new ThreadLocal(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public void addMoney() {
        synchronized (this) {
            int a = threadLocal.get() +1000;
            threadLocal.set(a);
            System.out.println(System.currentTimeMillis() + "存入1000");
            System.out.println("余额为" + threadLocal.get());
        }
    }

    public void removeMoney() {
        synchronized (this) {
            if (threadLocal.get() < 1000) {
                System.out.println("余额不足!");
                System.out.println("余额为" + threadLocal.get());
            } else {
                int a = threadLocal.get() - 1000;
                threadLocal.set(a);
                System.out.println(System.currentTimeMillis() + "取出1000");
                System.out.println("余额为" + threadLocal.get());
            }
        }
    }

}
