package com.kuang.factory.abstract1;

public class XiaomiRouter implements IrouterProduct{
    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开WIFI");
    }

    @Override
    public void start() {
        System.out.println("小米路由器启动");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关机");
    }
}
