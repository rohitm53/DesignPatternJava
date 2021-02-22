package com.rohit.designpattern.structuraldesignpattern.decorator;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }


}
