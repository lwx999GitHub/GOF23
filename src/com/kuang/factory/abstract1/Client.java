package com.kuang.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory=new XiaomiFactory();//小米工厂
        IphoneProduct IphoneProductXiaomi=xiaomiFactory.iphoneProduct();//小米工厂生产的手机
        System.out.println("===========小米手机==========");
        IphoneProductXiaomi.callup();//小米工厂手机打电话
        IphoneProductXiaomi.sendSms();//小米工厂手机发信息

        HuaweiFactory huaweiFactory=new HuaweiFactory();//华为工厂
        IphoneProduct iProductFactoryHuawei=huaweiFactory.iphoneProduct();//华为工厂生产的手机
        System.out.println("===========华为手机==========");
        iProductFactoryHuawei.callup();//华为工厂手机打电话
        iProductFactoryHuawei.sendSms();//华为工厂手机发短信
    }
}
