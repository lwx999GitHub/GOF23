package com.kuang.factory.proxy;

public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("出租房子");
    }
}
