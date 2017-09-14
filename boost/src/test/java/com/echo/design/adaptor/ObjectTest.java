package com.echo.design.adaptor;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class ObjectTest {
    public static void main (String[] args) {
        ObjectAdaptor objectTest = new ObjectAdaptor(new FlyCar());
        objectTest.normalRun();
    }
}
