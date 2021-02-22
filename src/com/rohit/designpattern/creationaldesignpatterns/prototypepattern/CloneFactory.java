package com.rohit.designpattern.creationaldesignpatterns.prototypepattern;

public class CloneFactory {

    public Animal getClone(Animal animal){
        return animal.makeCopy();
    }

}
