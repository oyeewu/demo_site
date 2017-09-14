package com.echo.com.echo.decorator;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class ChildC implements Parent {
    Parent parent;

    public ChildC(Parent parent) {
        this.parent = parent;
    }

    @Override
    public void run() {
        System.out.println("before ChildC");
        parent.run();
        System.out.println("after ChildC");
    }
}
