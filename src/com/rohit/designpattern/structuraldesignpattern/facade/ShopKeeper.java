package com.rohit.designpattern.structuraldesignpattern.facade;

public class ShopKeeper {

    private MobileShop iphone;
    private MobileShop onePlus;

    public ShopKeeper() {
        iphone = new Iphone();
        onePlus = new OnePlus();
    }

    public void saleIphone(){
        iphone.modelNo();
        iphone.price();
    }

    public void saleOnePlus(){
        onePlus.modelNo();
        onePlus.price();
    }
}
