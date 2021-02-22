package com.rohit.designpattern.creationaldesignpatterns.singelton;

public class ScrableTestThread {

    public static void main(String[] args) {

        Runnable getTiles = new GetTheTiles();

        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();

    }

}
