package com.echo.com.echo.decorator;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class ChildA implements Parent {
    Parent parent;

    public ChildA(Parent parent) {
        this.parent = parent;
    }

    @Override
    public void run() {
        System.out.println("before child A");
        parent.run();
        System.out.println("after child A");
    }
}
