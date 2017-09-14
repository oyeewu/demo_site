package com.echo.com.echo.decorator;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class Test {

    public static void main(String[] args) {
        Parent child = new Child();
        Parent ca = new ChildA(child);
        Parent cb = new ChildB(ca);
        Parent cc = new ChildC(cb);
        cc.run();

    }
}
