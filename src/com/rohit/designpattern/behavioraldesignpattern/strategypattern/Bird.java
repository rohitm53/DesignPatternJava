package com.rohit.designpattern.behavioraldesignpattern.strategypattern;


public class Bird extends Animal {

    public Bird() {
        setSound("Tweet");

        setFlyingType(new CanFly());

    }
}
