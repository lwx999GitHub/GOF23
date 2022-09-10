package com.kuang.factory.abstract1;

public class HuaweiPhone implements IphoneProduct{
    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("华为手机发信息");
    }

    @Override
    public void start() {
        System.out.println("华为手机开机");
    }
}
