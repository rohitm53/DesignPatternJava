package com.rohit.designpattern.structuraldesignpattern.decorator;

public class Mozzella extends ToppingDecorator{

    public Mozzella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");
        System.out.println("Adding Mozzeralla");
    }

    public String getDescription(){
        return temppizza.getDescription() + ",Mozella";
    }
    public double getCost(){
        return temppizza.getCost()+50;
    }

}
