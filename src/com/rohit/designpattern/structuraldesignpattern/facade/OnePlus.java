package com.rohit.designpattern.structuraldesignpattern.facade;

public class OnePlus implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("OnePlus 6T");
    }

    @Override
    public void price() {
        System.out.println(360000);
    }
}
