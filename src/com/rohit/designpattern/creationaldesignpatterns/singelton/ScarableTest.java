package com.rohit.designpattern.creationaldesignpatterns.singelton;

import java.util.LinkedList;

public class ScarableTest {

    public static void main(String[] args) {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instace 1 ID: "+System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTile = newInstance.getTiles(7);

        System.out.println("Player 1: "+playerOneTile);


        Singleton newInstanceTwo = Singleton.getInstance();

        System.out.println("Instace 1 ID: "+System.identityHashCode(newInstanceTwo));

        System.out.println(newInstanceTwo.getLetterList());


        LinkedList<String> playerTwoTile = newInstanceTwo.getTiles(7);
        System.out.println("Player 1: "+playerTwoTile);
    }
}
