package com.kuang.factory.abstract1;

public class XiaomiPhone implements IphoneProduct{
    @Override
    public void shutdown() {
       System.out.println("小米手机关机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("小米手机发信息");
    }

    @Override
    public void start() {
        System.out.println("小米手机开机");
    }
}
