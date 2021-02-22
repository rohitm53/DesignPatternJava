package com.rohit.designpattern.behavioraldesignpattern.iterator;

public class RadioStationJava {

    public static void main(String[] args) {

        SongOfThe90s songOfThe90s = new SongOfThe90s();
        SongOfThe80s songOfThe80s = new SongOfThe80s();
        SongOfThe70s songOfThe70s = new SongOfThe70s();

        DiskJockey diskJockey = new DiskJockey(songOfThe70s,songOfThe80s,songOfThe90s);

        diskJockey.showSongs2();



    }

}
