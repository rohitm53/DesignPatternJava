package com.rohit.designpattern.behavioraldesignpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongOfThe70s implements SongIterator {

    private ArrayList<SongInfo> bestSongs;

    public SongOfThe70s() {
        this.bestSongs = new ArrayList<>();

        addSongs("Imagin","John",1971);
        addSongs("My World","Alvrin",1971);
        addSongs("I will survive","Gloria",1979);
    }

    private void addSongs(String name, String bandName, int year) {

        SongInfo songInfo = new SongInfo(name,bandName,year);
        bestSongs.add(songInfo);
    }
//
//    public ArrayList<SongInfo> getBestSongs() {
//        return bestSongs;
//    }

    @Override
    public Iterator creatorIterator() {
        return bestSongs.iterator();
    }
}
