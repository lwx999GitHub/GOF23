package com.kuang.factory.abstract1;

public class XiaomiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IrouterProduct irouterProduct() {
        return new XiaomiRouter();
    }
}
