package com.rohit.designpattern.behavioraldesignpattern.observer;

public class StockObserver implements Observer{

    private double ibmPrice;
    private double googlePrice;
    private double applePrice;


    private static int observerIDTracker=0;

    private int observerID;

    public Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber=stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer "+this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {

        this.ibmPrice=ibmPrice;
        this.applePrice=applePrice;
        this.googlePrice=googlePrice;

        printPrices();

    }

    private void printPrices() {

        System.out.println("Observer ID "+observerID);
        System.out.println("IbmPrice "+ibmPrice);
        System.out.println("ApplePrice "+applePrice);
        System.out.println("GooglePrice "+googlePrice);

        System.out.println("\n\n\n");

    }
}
