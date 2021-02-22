package com.rohit.designpattern.behavioraldesignpattern.iterator;


import java.util.Arrays;
import java.util.Iterator;

public class SongOfThe80s implements SongIterator{

    SongInfo[] bestSongs;
    int count=0;

    public SongOfThe80s() {
        this.bestSongs = new SongInfo[3];

        addSongs("Imagin","John",1980);
        addSongs("My World","Alvrin",1980);
        addSongs("I will survive","Gloria",1980);
    }

    private void addSongs(String name, String bandName, int year) {

        SongInfo songInfo = new SongInfo(name,bandName,year);
        bestSongs[count++]=(songInfo);
    }

    @Override
    public Iterator creatorIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
