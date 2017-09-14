package com.echo.com.echo.decorator;

import sun.plugin2.util.ParameterNames;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class ChildB implements Parent {
    Parent parent;

    public ChildB(Parent parent) {
        this.parent = parent;
    }

    @Override
    public void run() {
        System.out.println("before ChildB");
        parent.run();
        System.out.println("after ChildB");
    }
}
