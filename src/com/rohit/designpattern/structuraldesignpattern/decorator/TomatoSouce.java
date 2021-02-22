package com.rohit.designpattern.structuraldesignpattern.decorator;

public class TomatoSouce extends ToppingDecorator{

    public TomatoSouce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    public String getDescription(){
        return temppizza.getDescription() + ",Sauce";
    }
    public double getCost(){
        return temppizza.getCost()+20;
    }

}
