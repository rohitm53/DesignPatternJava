package com.rohit.designpattern.structuraldesignpattern.decorator;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza temppizza;

    public ToppingDecorator(Pizza newPizza){
        this.temppizza=newPizza;
    }

    public String getDescription(){
        return temppizza.getDescription();
    }
    public double getCost(){
        return temppizza.getCost();
    }

}
