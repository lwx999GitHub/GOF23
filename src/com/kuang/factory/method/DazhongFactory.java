package com.kuang.factory.method;

public class DazhongFactory implements CarFactory{
    @Override
    public Car getCar() {
        return  new Dazhong();
    }
}
