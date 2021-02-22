package com.rohit.designpattern.creationaldesignpatterns.prototypepattern;

public class TestCloning {

    public static void main(String[] args) {

        CloneFactory animalFactory = new CloneFactory();

        Sheep shally = new Sheep();

        Sheep cloneSheep = (Sheep) animalFactory.getClone(shally);

        System.out.println(shally);
        System.out.println(cloneSheep);
        System.out.println("Shally Hashcode : "+System.identityHashCode(shally));
        System.out.println("Cloned Hashcode : "+System.identityHashCode(cloneSheep));

    }

}
