package com.rohit.designpattern.behavioraldesignpattern.iterator;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class SongOfThe90s implements SongIterator {

    private ConcurrentHashMap<Integer,SongInfo> hmSongs = new ConcurrentHashMap<>();
    int hashkey=0;

    public SongOfThe90s() {

        addSongs("Imagin","John",1990);
        addSongs("My World","Alvrin",1990);
        addSongs("I will survive","Gloria",1999);
    }

    private void addSongs(String name, String bandName, int year) {

        SongInfo songInfo = new SongInfo(name,bandName,year);
        hmSongs.put(hashkey++,songInfo);
    }

    @Override
    public Iterator creatorIterator() {
        return hmSongs.entrySet().iterator();
    }

//    public Map<Integer, SongInfo> getHmSongs() {
//        return hmSongs;
//    }
}
