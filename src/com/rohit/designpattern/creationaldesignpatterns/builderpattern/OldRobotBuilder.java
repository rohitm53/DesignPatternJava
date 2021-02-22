package com.rohit.designpattern.creationaldesignpatterns.builderpattern;

public class OldRobotBuilder implements RobotBuilder{


    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotlegs("Tin Legs");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Tin Amrs");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobottorso("Tin Torso");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
