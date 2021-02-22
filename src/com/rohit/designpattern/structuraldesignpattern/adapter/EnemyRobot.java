package com.rohit.designpattern.structuraldesignpattern.adapter;

import java.util.Random;

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands(){
        int attackDamage =  generator.nextInt(10)+1;
        System.out.println("Enemy Robot cause "+attackDamage + " with his hand");
    }

    public void walksForward(){
        int movement = generator.nextInt(10)+1;
        System.out.println("Enemy Robot walks forward "+movement+" Spaces");
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy Robot tramps on "+driverName);
    }

}
