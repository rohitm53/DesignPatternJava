package com.rohit.designpattern.creationaldesignpatterns.builderpattern;

public class Robot implements RobotPlan{

    private String head,amrs,torso,legs;

    @Override
    public void setRobotHead(String head) {

        this.head=head;
    }

    @Override
    public void setRobotArms(String amrs) {
        this.amrs=amrs;
    }

    @Override
    public void setRobotlegs(String legs) {
        this.legs=legs;
    }

    @Override
    public void setRobottorso(String torso) {
        this.torso=torso;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", amrs='" + amrs + '\'' +
                ", torso='" + torso + '\'' +
                ", legs='" + legs + '\'' +
                '}';
    }
}
