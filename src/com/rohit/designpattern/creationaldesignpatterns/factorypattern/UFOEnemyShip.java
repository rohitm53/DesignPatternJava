package com.rohit.designpattern.creationaldesignpatterns.factorypattern;

public class UFOEnemyShip extends EnemyShip{

    public UFOEnemyShip() {

        setName("UFO Enemy Ship");
        setAmtDamage(20);

    }

    public UFOEnemyShip(int number,String randStr){

        System.out.println("You sent: "+number+" "+randStr);
    }
}
