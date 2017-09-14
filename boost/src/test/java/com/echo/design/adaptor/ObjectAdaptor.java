package com.echo.design.adaptor;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class ObjectAdaptor implements NormalCar{
    SpecialCar specialCar;

    public ObjectAdaptor(SpecialCar specialCar) {
        this.specialCar = specialCar;
    }

    @Override
    public void normalRun() {
        System.out.println("normal run ......");
        specialCar.specialRun();
    }
}
