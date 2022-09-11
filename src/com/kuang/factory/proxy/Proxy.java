package com.kuang.factory.proxy;

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }
    @Override
    public void rent() {
        this.talk();
        host.rent();
        this.serviceOfRentAfter();
    }

    //出租前谈判
    private void talk(){
        System.out.println("==============出租之前谈判================");
    }

    //出租后服务（灯管坏了,停电,停水）
    private void serviceOfRentAfter(){
        System.out.println("==============出租后的服务（灯管坏了,停电,停水处理）================");
    }
}
