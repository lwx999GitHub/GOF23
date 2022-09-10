package com.kuang.factory.abstract1;

public class HuaweiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IrouterProduct irouterProduct() {
        return new HuaweiRouter();
    }
}
