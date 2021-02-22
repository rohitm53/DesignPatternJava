package com.rohit.designpattern.creationaldesignpatterns.singelton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {


    @Override
    public void run() {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instace ID: "+System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOnTile = newInstance.getTiles(7);

        System.out.println("Player : "+playerOnTile);

        System.out.println("Got Tiles");

    }
}
