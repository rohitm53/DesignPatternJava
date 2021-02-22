package com.rohit.designpattern.behavioraldesignpattern.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> listObserver;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;


    public StockGrabber() {

        listObserver = new ArrayList<>();

    }

    @Override
    public void register(Observer observer) {
        this.listObserver.add(observer);
    }

    @Override
    public void unregister(Observer observer) {

        int index = this.listObserver.indexOf(observer);

        System.out.println("Deleted  Observer "+ (index+1));

        this.listObserver.remove(index);

    }

    @Override
    public void notifyObserver() {

        for(Observer observer : listObserver){
            observer.update(ibmPrice,applePrice,googlePrice);
        }
    }


    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }


}
