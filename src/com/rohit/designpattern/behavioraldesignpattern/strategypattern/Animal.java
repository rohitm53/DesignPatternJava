package com.rohit.designpattern.behavioraldesignpattern.strategypattern;


public class Animal {

    private String name;
    private String sound;
    private String height;
    private int weight;
    private String favFood;
    private String speed;

    private Fly flyingType;   //For  Strategy Pattern


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {

        if(weight>0){
            this.weight=weight;
        }else{
            System.out.println("Weight shud be greater than zero");
        }
    }

    public int getWeight() {
        return weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Fly getFlyingType() {
        return flyingType;
    }

    public void setFlyingType(Fly flyingType) {
        this.flyingType = flyingType;
    }

    ///Stategy Pattern behaviour
    public String tryToFy(){
        return flyingType.tryToFly();
    }
}
