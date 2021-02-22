package com.rohit.designpattern.behavioraldesignpattern.observer;

import java.text.DecimalFormat;

public class GetStocks implements Runnable{

    private String name;
    private double price;

    private StockGrabber stockGrabber;

    public GetStocks(StockGrabber stockGrabber,String name,double price){
        this.name=name;
        this.stockGrabber=stockGrabber;
        this.price=price;
    }

    @Override
    public void run() {

        for(int i=0;i<=20;i++){

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            DecimalFormat df = new DecimalFormat("#.##");
            price=Double.valueOf(df.format(price+(Math.random()*(0.06)-0.3)));


            if(name.equalsIgnoreCase("IBM")){
                stockGrabber.setIbmPrice(price);
            }else if(name.equalsIgnoreCase("Apple")){
                stockGrabber.setIbmPrice(price);
            }else{
                stockGrabber.setIbmPrice(price);
            }

            System.out.println(name + ":"+df.format(price));

        }



    }
}
