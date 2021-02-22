package com.rohit.designpattern.behavioraldesignpattern.observer;

public class GrabStocks {

    public static void main(String[] args) {


        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(198);
        stockGrabber.setApplePrice(677);
        stockGrabber.setGooglePrice(588);

        Runnable getIbm = new GetStocks(stockGrabber,"IBM",198);
        Runnable getApple = new GetStocks(stockGrabber,"Apple",198);
        Runnable getGoogle = new GetStocks(stockGrabber,"Google",198);


        new Thread(getIbm).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();

    }

}
