package com.kuang.factory.method;

//静态工厂模式
//增加一个新产品，如果不修改代码，做不到
//开闭原则
public interface CarFactory {
    Car getCar();
}
