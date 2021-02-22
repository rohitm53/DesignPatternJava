package com.rohit.designpattern.creationaldesignpatterns.factorypattern;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory factory = new EnemyShipFactory();

        EnemyShip ufoShip = null;

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption ="";

        System.out.println("What type of ship?(U/R)");
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        ufoShip = factory.makeEnemyShip(enemyShipOption);

        
        doStuff(ufoShip);

    }

    private static void doStuff(EnemyShip ufoShip) {

        ufoShip.displayEnemyShip();
        ufoShip.followHeroShip();
        ufoShip.enemyShipShoots();

    }

}
