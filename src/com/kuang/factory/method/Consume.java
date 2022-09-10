package com.kuang.factory.method;



public class Consume {
    public static void main(String[] args) {
        /*Car car =new DazhongFactory();
        car.name();*/

        Car wulingCar =new WulingFactory().getCar();
        wulingCar.name();

        Car dazhongCar =new DazhongFactory().getCar();
        dazhongCar.name();

        Car teslaCar =new TeslaFactory().getCar();
        teslaCar.name();
    }
}
