package com.rohit.designpattern.creationaldesignpatterns.builderpattern;

public interface RobotBuilder {

    public void buildRobotHead();
    public void buildRobotLegs();
    public void buildRobotArms();
    public void buildRobotTorso();
    public Robot getRobot();

}
