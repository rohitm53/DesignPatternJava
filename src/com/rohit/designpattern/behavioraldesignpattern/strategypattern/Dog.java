package com.rohit.designpattern.behavioraldesignpattern.strategypattern;

public class Dog extends Animal {

    public Dog(){
        super();
        setSound("Bark");
        setFlyingType(new CantFly());
    }

    public void digHole(){
        System.out.println("Dig a hole");
    }

    public void changeVar(int random){
        random = 30;
        System.out.println("Rand num in changeVar : "+random );
    }
}
