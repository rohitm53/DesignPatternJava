package com.rohit.designpattern.behavioraldesignpattern.strategypattern;

public interface Fly {

    String tryToFly();
}

class CanFly implements Fly {

    @Override
    public String tryToFly() {
        return "Flying High";
    }
}

class CantFly implements Fly{

    @Override
    public String tryToFly() {
        return "Can't Fly";
    }
}
