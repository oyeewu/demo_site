package com.echo.com.echo.decorator;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class Child implements Parent {
    @Override
    public void run() {
        System.out.println("source child run ......");
    }
}
