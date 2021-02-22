package com.rohit.designpattern.behavioraldesignpattern.iterator;

import java.util.Iterator;

public class DiskJockey {

    private SongOfThe70s songOfThe70s;
    private SongOfThe80s songOfThe80s;
    private SongOfThe90s songOfThe90s;

    private SongIterator song70sIterator;
    private SongIterator song80sIterator;
    private SongIterator song90sIterator;

    public DiskJockey(SongIterator song70sIterator, SongIterator song80sIterator, SongIterator song90sIterator) {
        this.song70sIterator = song70sIterator;
        this.song80sIterator = song80sIterator;
        this.song90sIterator = song90sIterator;
    }

//    public void showSongs(){
//
//        ArrayList<SongInfo> al70s = songOfThe70s.getBestSongs();
//
//        for(SongInfo songInfo : al70s){
//            System.out.println(songInfo.getSongName());
//            System.out.println(songInfo.getYearReleased());
//        }
//
//        SongInfo[] arrSongs = songOfThe80s.getBestSongs();
//
//        for (SongInfo songInfo : arrSongs){
//            System.out.println(songInfo.getSongName());
//            System.out.println(songInfo.getYearReleased());
//        }
//
//        Map<Integer,SongInfo> hmSongs = songOfThe90s.getHmSongs();
//
//        for(Integer i : hmSongs.keySet()){
//            SongInfo songInfo = hmSongs.get(i);
//            System.out.println(songInfo.getSongName());
//            System.out.println(songInfo.getYearReleased());
//        }
//
//    }

    public void showSongs2(){

        Iterator songs70s = song70sIterator.creatorIterator();
        Iterator songs80s = song80sIterator.creatorIterator();
        Iterator songs90s = song80sIterator.creatorIterator();

        System.out.println("----Songs of 70s---------");
        printSongs(songs70s);
        System.out.println("-------------------------");

        System.out.println("----Songs of 80s---------");
        printSongs(songs80s);
        System.out.println("-------------------------");

        System.out.println("----Songs of 90s---------");
        printSongs(songs90s);
        System.out.println("-------------------------");

    }

    private void printSongs(Iterator iterator) {

        while (iterator.hasNext()){

            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getYearReleased());

        }

    }
}
