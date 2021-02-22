package com.rohit.designpattern.structuraldesignpattern.decorator;

public class PizzaMaker {

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSouce(new Mozzella(new PlainPizza()));

        System.out.println("Ingredient : "+basicPizza.getDescription());
        System.out.println("Cost : "+basicPizza.getCost());


    }

}
