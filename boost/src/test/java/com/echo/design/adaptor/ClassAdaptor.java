package com.echo.design.adaptor;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class ClassAdaptor extends FlyCar implements NormalCar {
    @Override
    public void normalRun() {
        System.out.println("normal run ......");
        specialRun();
    }
}
