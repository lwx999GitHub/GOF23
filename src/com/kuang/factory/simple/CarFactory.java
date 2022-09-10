package com.kuang.factory.simple;

//静态工厂模式
//增加一个新产品，如果不修改代码，做不到
//开闭原则
public class CarFactory {
    public static Car getCar(String car) {
        if (car.equals("五凌")){
            return new WulingCar();
        }else if(car.equals("大众")){
            return new Dazhong();
        }else{
            return null;
        }
    }
}
