package com.rohit.designpattern.behavioraldesignpattern.strategypattern;

public class StrategyPatternMain {

    public static void main(String[] args) {

        Animal sparky = new Dog();
        Animal twiky = new Bird();

        System.out.println("Dog : "+sparky.tryToFy());
        System.out.println("Bird : "+twiky.tryToFy());

    }

}
