package com.rohit.designpattern.creationaldesignpatterns.singelton;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstInstances=null;
    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    private Singleton(){}

    public static Singleton getInstance(){

        if(firstInstances==null){
            if(firstThread){
                firstThread = false;
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Singleton.class){
                firstInstances=new Singleton();
                Collections.shuffle(firstInstances.letterList);
            }
        }
        return firstInstances;
    }

    public LinkedList<String> getLetterList(){
        return firstInstances.letterList;
    }


    public LinkedList<String> getTiles(int howManyTiles){

        LinkedList<String> tilesToSend = new LinkedList<>();
        for(int i=0;i<=howManyTiles;i++){
            tilesToSend.add(firstInstances.letterList.remove(0));
        }
        return tilesToSend;
    }


}
