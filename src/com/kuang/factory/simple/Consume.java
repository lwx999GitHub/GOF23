package com.kuang.factory.simple;

public class Consume {
    public static void main(String[] args) {
        Car car1=CarFactory.getCar("五凌");
        Car car2=CarFactory.getCar("大众");
        car1.name();
        car2.name();
        //System.out.println(car.name());
    }
}
