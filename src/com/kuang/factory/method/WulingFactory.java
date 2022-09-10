package com.kuang.factory.method;

public class WulingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WulingCar();
    }
}
